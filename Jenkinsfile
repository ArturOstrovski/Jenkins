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
                        ret = bat (script: './Stages/Stage1.bat', returnStdout: true)
                        echo $ret
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
                        label "windows"
                    }
                    steps {
                        echo $ret
                    }
            
                }
            }    
        }
    }    
}
