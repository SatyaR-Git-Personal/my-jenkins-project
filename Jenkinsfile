pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {

        stage('Clone') {
            steps {
                echo '===== Cloning from GitHub ====='
                checkout scm
            }
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