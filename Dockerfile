FROM openjdk:8-jdk-alpine

COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

CMD ["java", "-jar", "/app/demo.jar"]
