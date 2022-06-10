FROM openjdk:8
VOLUME /tmp
EXPOSE 8061
ADD ./target/discovery-0.0.1-SNAPSHOT.jar service-discovery.jar
ENTRYPOINT ["java","-jar","/service-discovery.jar"]