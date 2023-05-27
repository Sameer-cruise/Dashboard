#!/bin/bash

echo
echo "--------------------------------------------------"
echo "Initiating SetupLMOFrontEnd.sh"
echo "--------------------------------------------------"
echo

service_name=lmo-frontend

echo "#> Creating ${service_name} service."
cat >> /etc/systemd/system/${service_name}.service << HEREDOC
[Unit]
Description=Workload Frontend Service

[Service]
User=root
WorkingDirectory=/opt/deployment_home/LMO/myboard
ExecStart=/usr/bin/node /opt/deployment_home/LMO/myboard/start.js
Restart=on-failure

[Install]
WantedBy=multi-user.target
HEREDOC

echo "#> Restarting daemon."
systemctl daemon-reload

echo "#> Enabling ${service_name} service."
systemctl enable ${service_name}.service

echo "#> Starting ${service_name} service."
systemctl start ${service_name}


echo
echo "--------------------------------------------------"
echo "Terminating SetupLMOFrontEnd.sh"
echo "--------------------------------------------------"
echo