#!/bin/bash

echo
echo "--------------------------------------------------"
echo "Initiating build.sh"
echo "--------------------------------------------------"
echo

echo "#> Initiating Setup."
cd ${APP_DIR}/src-java/

echo "#> Packaging Artefact for deployment."
mvn -s qcp-settings.xml clean package -Dmaven.test.skip=true

echo "#> Moving springboot(backend) artefacts to payload directory"
cp -r src/main/resources $PAYLOAD_DIR/
cp target/Dashboard-1.14.jar $PAYLOAD_DIR/
cp -r $COMPONENT_DIR/scripts $PAYLOAD_DIR/

echo "#> Moving LMO(front end) artefacts to payload directory"
cd ${APP_DIR}/src-nodejs
cp -r LMO $PAYLOAD_DIR/

echo "#> Moving Workload(front end) artefacts to payload directory"
cp -r Workload $PAYLOAD_DIR/

chmod -R 777 $PAYLOAD_DIR/

echo
echo "--------------------------------------------------"
echo "Terminating build.sh"
echo "--------------------------------------------------"
echo



