FROM openjdk:8-jdk-alpine

WORKDIR /app

ARG JAR_FILE=jar-deploy-to-gcp/webservice-demo-0.0.1-SNAPSHOT.jar

#COPY jar-deploy-to-gcp/webservice-demo-0.0.1-SNAPSHOT.jar webservice-demo.jar
COPY ${JAR_FILE} webservice-demo.jar

ENTRYPOINT ["java" , "-jar" , "webservice-demo.jar"]

#EXPOSE 8080