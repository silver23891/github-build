FROM openjdk:21-slim-buster

COPY target/*.jar /opt/app/app.jar

WORKDIR /opt/app

CMD ["java", "-jar", "app.jar"]
