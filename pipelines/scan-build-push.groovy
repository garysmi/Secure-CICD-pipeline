pipeline {
    agent any
    stages {
        stage('Install packages') {
            sh "pip install bandit safety"
        }
        Parallel {
            stage('Run Bandit Checks') {
                steps {
                    //
                }
            }
            Stage('Run safety Checks') {
                Steps {
                    //
                }
            }
        }
        Stage('Build Containers') {
            steps {
                //
            }
        }
    }
}