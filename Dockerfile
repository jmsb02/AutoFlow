FROM openjdk:17-jdk-slim

COPY build/libs/AutoFlow-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-Dspring.profiles.active=prod", "-jar", "app.jar"]