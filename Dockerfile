FROM openjdk:8
ADD *.jar  /app.jar
EXPOSE 8080
ENTRYPOINT ["java",  "-jar", "/app.jar"]