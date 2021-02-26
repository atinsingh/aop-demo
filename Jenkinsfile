pipeline {
  agent {
    docker {
      image 'maven:3.6.3-jdk-8'
    }

  }
  stages {
    stage('Prep') {
      steps {
        sh 'echo Hello World'
        echo 'Running Fine'
      }
    }

    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }

    stage('Archive') {
      steps {
        junit '**/*.xml'
      }
    }

  }
  environment {
    USER_NAME = 'ATIN'
  }
}