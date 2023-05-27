#!/bin/bash

echo
echo "--------------------------------------------------"
echo "Initiating SetupBackend.sh"
echo "--------------------------------------------------"
echo

cd /opt/deployment_home/jar

echo "#> Recalling Secrets for $pipeline_Ase."
if [ "$pipeline_Ase" == "dev" ];
then
    #Escaping the "/" for using sed later
    DB_CONN_STRING="mxdb-psup.qcpaws.qantas.com.au:1526\/mxproddb"
    APU_URL="https:\/\/api-stg.qantas.com.au\/api\/employee\/apualerts\/v1\/transits\/"
else
    DB_CONN_STRING="mxdb-prod.qcpaws.qantas.com.au:1526\/mxproddb" 
    APU_URL="https:\/\/api.qantas.com.au\/api\/employee\/apualerts\/v1\/transits\/"
fi  

echo "#> Revealing secrets for $pipeline_Ase."

DB_USERNAME=`kms_decrypt $app_DB_USERNAME`
sed -i "s/DB_USERNAME/$DB_USERNAME/" application.properties

DB_PASSWORD=`kms_decrypt $app_DB_PASSWORD`
sed -i "s/DB_PASSWORD/$DB_PASSWORD/" application.properties

sed -i "s/DB_CONN_STRING/$DB_CONN_STRING/" application-PROD.properties

sed -i "s/APU_URL/$APU_URL/" apu.properties

APU_ACCESS_TOKEN=`kms_decrypt $app_APU_ACCESS_TOKEN`
sed -i "s/APU_ACCESS_TOKEN/$APU_ACCESS_TOKEN/" apu.properties

echo "#> Creating backend service for dashboards."
ln -s /opt/deployment_home/jar/Dashboard-1.14.jar /etc/init.d/backend

echo "#> Starting the backend service."
service backend start


echo
echo "--------------------------------------------------"
echo "Terminating SetupBackend.sh"
echo "--------------------------------------------------"
echo