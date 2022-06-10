FROM openjdk:8
VOLUME /tmp
EXPOSE 8001
ADD ./target/service-bus-0.0.1-SNAPSHOT.jar service-bus.jar
ENTRYPOINT ["java","-jar","/service-bus.jar"]