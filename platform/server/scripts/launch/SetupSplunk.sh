echo
echo "--------------------------------------------------"
echo "Initiating SetupSplunk.sh"
echo "--------------------------------------------------"
echo

source /root/bamboo-vars.conf

if [[ $bamboo_deployment_env == "NonProduction" ]]; then
	SPLUNK_INDEX="engdash_a1238_nonprod"
else
	SPLUNK_INDEX="engdash_a1238_prod"
fi

SPLUNK_BASE_DIR="/opt/splunkforwarder/etc/apps/engdash/local"

echo "#> Creating Splunk App Directory."
[[ ! -d "$SPLUNK_BASE_DIR" ]] && mkdir -p "$SPLUNK_BASE_DIR"

echo "#> Creating config file for Splunk."
cat <<EOF >> "$SPLUNK_BASE_DIR/inputs.conf"
_meta = appid::${bamboo_planKey}  product::${bamboo_pipeline_name} branch::${bamboo_shortPlanName} buildno::${bamboo_buildNumber} environment::${bamboo_deployment_env}

#Monitoring logs for backend.
[monitor:///opt/deployment_home/jar/dashboard.log]
disabled = false
sourcetype = engdash-backend
index = $SPLUNK_INDEX

EOF

chown -R splunk:splunk /opt/splunkforwarder/etc/apps/engdash
chmod -R 755 /opt/splunkforwarder/etc/apps/engdash/

echo "#> Restarting Splunk Service."
systemctl restart splunk.service

echo
echo "--------------------------------------------------"
echo "Terminating SetupSplunk.sh"
echo "--------------------------------------------------"
echo