FROM jboss/wildfly
ADD target/app.war /opt/jboss/wildfly/standalone/deployments/
