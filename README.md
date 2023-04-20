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

1.Clone the repository

2.Build the project: ./mvn package

3.Build the Docker: docker build -t rest-video .

4.Push the Docker image to your Docker repository: docker push my-docker-repo/my-video-app

5.Install the Helm chart: helm install my-video-app ./my-video-app

Usage

Once the Helm chart is installed, you can use the API by sending HTTP requests to the /videos endpoint

Here is for Example: -

Create a new video

Request Body

| Field       | Type     | Description                                           |
| ----------- | -------- | ----------------------------------------------------- |
| title       | string   | The title of the video (required)                     |
| description | string   | The description of the video (required)               |
| duration    | long     | The duration of the video in seconds (required)       |
| thumbnail   | string   | The URL of the video thumbnail (optional)              |
| createdTime | datetime | The date and time when the video was created (required)|

POST /videos
Content-Type: application/json

{
  "title": "Video",
  "description": "This is a video",
  "duration": 1200,
  "thumbNail": "http://videoexample.com/thumbnail.jpg",
  "createdTime": "2023-04-13T12:00:00Z"
}

Conclusion

In this project, I have built a simple REST API for managing videos. I have used Java 1.8 and Spring Boot to build the API, and MySQL as the database. I have containerized the API using Docker and deployed it to Kubernetes using Helm charts.

I have also enabled Swagger for API documentation and provided data validations for creating new videos.


