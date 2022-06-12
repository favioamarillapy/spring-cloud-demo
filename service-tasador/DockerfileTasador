FROM openjdk:8
VOLUME /tmp
EXPOSE 8002
ADD ./target/service-tasador-0.0.1-SNAPSHOT.jar service-tasador.jar
ENTRYPOINT ["java","-jar","/service-tasador.jar"]