pipeline {
    agent any

    stages {
        stage('Checkout') {
              steps {
                  checkout scm
              }
          }
        stage('Clean') {
            steps {
                mvn clean
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
