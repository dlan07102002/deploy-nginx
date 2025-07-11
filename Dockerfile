FROM openjdk:17-alpine
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx128m", "-Xms64m", "-XX:+UseSerialGC", "-jar", "app.jar"]


