FROM openjdk:17-alpine
ADD .drop/target/member*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]