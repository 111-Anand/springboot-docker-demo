pipeline {
    agent any

    environment {
        IMAGE_NAME = 'springboot-docker-demo'
        IMAGE_TAG = 'latest'
        REGISTRY = '' // Optional: add Docker registry if needed
    }

    stages {
        stage('Checkout') {
            steps {
                echo '🔄 Cloning repository...'
                git branch: 'main', url: 'https://github.com/111-Anand/springboot-docker-demo.git'
            }
        }

        stage('Build with Maven') {
            steps {
                echo '🚧 Building the project...'
                bat 'mvn clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo '🐳 Building Docker image...'
                bat "docker build -t %IMAGE_NAME%:%IMAGE_TAG% ."
            }
        }

        stage('Run Docker Container') { 
            steps {
                echo '🚀 Running Docker container...'
                bat '''
                    docker stop springboot-app || true
                    docker rm springboot-app || true
                    docker run -d -p 3000:8080 --name springboot-app %IMAGE_NAME%:%IMAGE_TAG%
                '''
            }
        }
    }

    post {
        success {
            echo '🎉 Deployment successful!'
        }
        failure {
            echo '❌ Deployment failed.'
        }
    }
}
