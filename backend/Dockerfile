FROM openjdk:17-jdk-slim

EXPOSE 8080

RUN apt update && apt install maven -y && mkdir project_deploy

WORKDIR project_deploy

COPY . .

RUN mvn clean package -Dmaven.test.skip

ENTRYPOINT ["java", "-jar", "target/deploy-0.0.1-SNAPSHOT.jar"]