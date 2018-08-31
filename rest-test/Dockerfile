FROM jboss/wildfly:latest

RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

ADD target/rest-test.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 9990 8080 

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]

