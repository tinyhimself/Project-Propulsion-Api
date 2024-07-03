FROM openjdk:23-jdk-oracle
ARG JAR_FILE=build/libs/*.jar
COPY /build/libs/propulsion-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]