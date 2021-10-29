FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY jar-deploy-to-gcp/webservice-demo-0.0.1-SNAPSHOT.jar webservice-demo.jar

ENTRYPOINT ["java" , "-jar" , "webservice-demo.jar"]