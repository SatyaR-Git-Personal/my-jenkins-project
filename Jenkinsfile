pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo '===== Cloning from GitHub ====='
                checkout scm
            }
        }
        docker.image('maven:3.9.11-eclipse-temurin-21').inside {
            sh 'mvn clean package'
        }

        stage('Build') {
            steps {
                echo '===== Compiling ====='
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo '===== Running Tests ====='
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo '===== Packaging JAR ====='
                sh 'mvn package -DskipTests'
            }
        }

    }

    post {
        success {
            echo '✅ Build Successful!'
        }
        failure {
            echo '❌ Build Failed!'
        }
    }
}