FROM websphere-liberty:microProfile
COPY server.xml /config/
COPY target/lib /opt/IBM/lib
ADD target/javarest_microservice.war /opt/ibm/wlp/usr/servers/defaultServer/dropins/
ENV LICENSE accept
EXPOSE 9080
