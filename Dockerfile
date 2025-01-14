
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/demo.jar /app/demo.jar

EXPOSE 8080

CMD ["java", "-jar", "demo.jar"]