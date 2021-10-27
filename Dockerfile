FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/webservice-demo-0.0.1-SNAPSHOT.jar  webservice-demo.jar

ENTRYPOINT ["java" , "-jar" , "webservice-demo.jar"]