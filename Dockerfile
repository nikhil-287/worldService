FROM amazoncorretto:17-alpine
COPY ./target/worldService-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]