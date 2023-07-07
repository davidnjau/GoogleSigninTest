FROM maven:3.6.3-jdk-11-slim AS build
FROM openjdk:11
EXPOSE 7001
WORKDIR /javabackend
COPY . /javabackend
ADD target/GoogSignIn-0.0.1-SNAPSHOT.jar GoogSignIn-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","target/GoogSignIn-0.0.1-SNAPSHOT.jar"]