FROM openjdk:1.8
WORKDIR /rest-api
COPY target/SpringSwagger-0.0.1-SNAPSHOT.war /rest-api
CMD ["java", "-jar", "SpringSwagger-0.0.1-SNAPSHOT.war"]
