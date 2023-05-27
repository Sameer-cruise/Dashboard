#!/bin/bash

echo
echo "--------------------------------------------------"
echo "Initiating CopyArtefacts.sh"
echo "--------------------------------------------------"
echo

source /root/bamboo-vars.conf
source /root/context
source $HOME/.bash_profile

DEPLOYMENT_HOME=deployment_home

echo "#> Creating $DEPLOYMENT_HOME in /opt."
mkdir -p /opt/$DEPLOYMENT_HOME

echo "#> Creating directory for jar in /opt/$DEPLOYMENT_HOME."
mkdir -p /opt/$DEPLOYMENT_HOME/jar

echo "#> Creating logs directory: /opt/$DEPLOYMENT_HOME/logs."
mkdir /opt/$DEPLOYMENT_HOME/logs

echo "#> Copying Dashboard-1.14.jar to /opt/$DEPLOYMENT_HOME/jar."
cp /root/payload/Dashboard-1.14.jar /opt/$DEPLOYMENT_HOME/jar

echo "#> Copying resources directory for jar to /opt/$DEPLOYMENT_HOME."
cp -r /root/payload/resources/. /opt/$DEPLOYMENT_HOME/jar

echo "#> Copying Shell scripts to /opt/$DEPLOYMENT_HOME."
cp -r /root/payload/scripts /opt/$DEPLOYMENT_HOME

echo "#> Copying LMO artefacts to /opt/$DEPLOYMENT_HOME."
cp -r /root/payload/LMO /opt/$DEPLOYMENT_HOME

echo "#> Copying Workload artefacts to /opt/$DEPLOYMENT_HOME."
cp -r /root/payload/Workload /opt/$DEPLOYMENT_HOME

echo "#> Listing /opt/$DEPLOYMENT_HOME"
cd /opt/$DEPLOYMENT_HOME
ls -ltr

echo
echo "--------------------------------------------------"
echo "Terminating CopyArtefacts.sh"
echo "--------------------------------------------------"
echo