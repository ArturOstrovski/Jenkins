def myVariable = "foo"
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
                        script {
                            def num = bat (script: './Stages/Stage1.bat', returnStdout: true)
                            println(num)
                            myVariable = $num 
                        }
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
