#!/bin/bash

echo
echo "--------------------------------------------------"
echo "Initiating SetEnvironment.sh"
echo "--------------------------------------------------"
echo

# echo "#> Creating PROXY setting into 'profile' file"
cat >> /etc/profile <<HEREDOC
export proxy_hostname=proxy.qcpaws.qantas.com.au
export proxy_port=3128
export HTTP_PROXY="http://\$proxy_hostname:\$proxy_port"
export http_proxy="http://\$proxy_hostname:\$proxy_port"
export HTTPS_PROXY="http://\$proxy_hostname:\$proxy_port"
export https_proxy="http://\$proxy_hostname:\$proxy_port"
export ALL_PROXY="http://\$proxy_hostname:\$proxy_port"
export no_proxy="${no_proxy},*.qcpaws.qantas.com.au"
HEREDOC

# # echo "#> source variables from profile, context and bamboo-vars"
. /etc/profile
. /root/context
. /root/bamboo-vars.conf

echo "#> Installing JDK-1.8"
JAVA_PACKAGE=java-1.8.0-openjdk-devel
yum install -y "${JAVA_PACKAGE}" || do_fail "Failed to install JAVA_PACKAGE: ${JAVA_PACKAGE}"
export JAVA_HOME=/usr/lib/jvm/java-1.8.0

# echo "#> Installing the certificate in the java trust store."
# keytool -import -trustcacerts -file ${APP_DIR}/src-java/src/main/resources/certs/rds-ca-2019-root.pem -cacerts -storepass changeit -alias rds-combined-ca-bundle

# keytool -import -noprompt -trustcacerts -file /opt/deployment_home/jar/certs/rds-ca-2019-root.pem -keystore /usr/lib/jvm/java/jre/lib/security/cacerts/keystore.jks

echo "#> Installing Apache Maven."
yum install -y maven || do_fail "Failed to install Maven."

echo "#> Installing NodeJS-12.x."
curl -sL https://rpm.nodesource.com/setup_12.x | bash -
yum -y install nodejs || do_fail "Failed to install NodeJS."

echo "#> Installing atlasboard"
npm install -g atlasboard

echo
echo "--------------------------------------------------"
echo "Terminating SetEnvironment.sh"
echo "--------------------------------------------------"
echo