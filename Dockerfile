FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/jenkinspipeline.jar jenkinspipeline.jar
ENTRYPOINT ["java","-jar","jenkinspipeline.jar"]