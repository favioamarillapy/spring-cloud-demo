FROM openjdk:8
VOLUME /tmp
EXPOSE 8060
ADD ./target/gateway-0.0.1-SNAPSHOT.jar gateway-server.jar
ENTRYPOINT ["java","-jar","/gateway-server.jar"]