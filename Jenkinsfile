pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                script { 
                }
            }
          
            post {
                always {
                    echo 'Cleaning up...'
                }
                success {
                    echo 'Deployment successful!'
                }
                failure {
                    echo 'Deployment failed!'
                }
            }
        }
    }
}
