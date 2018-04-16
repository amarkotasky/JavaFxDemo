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
                sh 'cd ./my-app' 
                echo ${pwd}
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
