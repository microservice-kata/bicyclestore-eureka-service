FROM openjdk:8-jdk-alpine

MAINTAINER Laijin Lu <1@aikin.me>

COPY build/libs/service-registry-discovery.jar /app/service-registry-discovery.jar

WORKDIR /app

CMD ["java", "-jar", "-Xmx2048m", "service-registry-discovery.jar"]
