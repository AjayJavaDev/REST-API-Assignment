FROM openjdk:1.8
ADD target/myapp.jar/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
