# syntax=docker/dockerfile:experimental
FROM openjdk:8-jdk-alpine
VOLUME /tmp

COPY target/*.jar promfed.jar

ENTRYPOINT ["java", "-jar", "promfed.jar"]
