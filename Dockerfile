FROM openjdk:1.8
WORKDIR /rest-api
COPY SpringSwagger-0.0.1-SNAPSHOT.jar /rest-api
CMD ["java", "-jar", "SpringSwagger-0.0.1-SNAPSHOT.jar"]
