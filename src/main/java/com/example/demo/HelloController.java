package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Project: Containerized Spring Boot Application with CI/CD Pipeline Using Jenkins\n" +
                "This project aims to develop a Spring Boot application, containerize it using Docker, and automate its deployment using a CI/CD pipeline with Jenkins.\n" +
                "\n" +
                "Technologies Used\n" +
                "\n" +
                "Technology  -   Purpose\n" +
                "Spring Boot  -   Backend development\n" +
                "Docker     -   Containerization\n" +
                "Jenkins -   CI/CD automation\n" +
                "Git & GitHub - Version control\n" +
                "\n" +
                "Expected Outcome:\n" +
                "A fully functional Spring Boot application, containerized with Docker.\n" +
                "Automated deployment and testing via a Jenkins CI/CD pipeline.\n" +
                "Consistency across development, testing, and production environments.\n" +
                "Faster and error-free deployment cycle.\n" +
                "Scalable and efficient deployment architecture.\n" +
                "\n" +
                "Objectives: \n" +
                "Develop a Spring Boot REST API.\n" +
                "Containerize the application using Docker.\n" +
                "Set up Jenkins CI/CD pipeline to automate builds and deployments.";
    }
}
