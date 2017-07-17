FROM artifactory.cobalt.com/dapws:latest
# FROM artifactory.cobalt.com/java8_tomcat8:8.0.21

USER root

ENV PATH="/java/bin:/tomcat/bin:$PATH" JAVA_HOME="/java" CATALINA_HOME="/tomcat"
ENV CATALINA_OPTS="$CATALINA_OPTS -Xms512m -Xmx2G -XX:MaxPermSize=1G"

# Set the required JVM Memory.
ENV JVM_MEMORY 2048m


COPY target/partner-program*.war /tomcat/webapps/ROOT.war

EXPOSE 8080


# Group label for SYSDIG reporting.
LABEL vendor="Hackathon - Futuristic"

# File Author / Maintainer
MAINTAINER SEA DAP OOS <DAPOOS@cdk.com>

#CMD ["java","-server","-Xmx1G","-Xms512m","-jar","/opt/partner-program/partner-program.war"]
# CMD ["catalina.sh", "run"]
CMD ["/run.sh"]
