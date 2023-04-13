# REST-API-Assignment

Video API
This is a REST API for managing videos.

Prerequisites

Java 1.8
Docker
Kubernetes
Helm
MySQL

Installation

Clone the repository
Build the project: ./mvn package
Build the Docker: docker build -t rest-video .
Push the Docker image to your Docker repository: docker push my-docker-repo/my-video-app
Install the Helm chart: helm install my-video-app ./my-video-app

Usage

Once the Helm chart is installed, you can use the API by sending HTTP requests to the /videos endpoint

Here is for Example: -

Create a new video

POST /videos
Content-Type: application/json

{
  "title": "Video",
  "description": "This is a video",
  "duration": 1200,
  "thumbNail": "http://example.com/thumb.jpg",
  "createdTime": "2023-04-13T12:00:00Z"
}

Conclusion

In this project, I have built a simple REST API for managing videos. I have used Java 1.8 and Spring Boot to build the API, and MySQL as the database. I have containerized the API using Docker and deployed it to Kubernetes using Helm charts.

I have also enabled Swagger for API documentation and provided data validations for creating new videos.


