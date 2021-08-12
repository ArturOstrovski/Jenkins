def myVariable = ""
pipeline {
    agent none
    parameters {
        string(name: 'PERSON', defaultValue: '', description: 'Who should I say hello to?')
    }
    stages {
        stage('Run Stages') {
            parallel {
                stage('Stage batch') {
                    agent {
                        label "windows"
                    }
                    steps {
                       
                        echo "Labas"
                        params.PERSON = bat (script: './Stages/Stage1.bat', returnStdout: true)
                        echo "Some mothe $params.PERSON"
                       
                    }
            
                }
                stage('Stage generate') {
                    agent {
                        label "windows"
                    }
                    steps {
                        bat './Stages/Stage2.bat'
                    }
                }
                stage('Stage Print Random') {
                    agent {
                        label "linux"
                    }
                    steps {
                        
                        sh "chmod +x ./Stages/Stage4.sh"
                        sh "./Stages/Stage4.sh ${myVariable}"
                    }
            
                }
            }    
        }
    }    
}
