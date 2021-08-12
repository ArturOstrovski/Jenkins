pipeline {
    agent none
    stages {
        stage('Run Stages') {
            parallel {
                stage('Stage batch') {
                    agent {
                        label "windows"
                    }
                    steps {
                        bat './Jenkins/Stage1.bat'
                    }
            
                }
                stage('Stage generate') {
                    agent {
                        label "windows"
                    }
                    steps {
                        bat './Jenkins/Stage2.bat'
                    }
                } 
            }    
        }
    }    
}
