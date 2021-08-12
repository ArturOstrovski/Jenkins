def myVariable
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
                        echo "Labas"
                        def tmp_param = bat (script: './Stages/Stage1.bat', returnStdout: true)
                            echo "Some muther... ${tmp_param}"
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
                        sh "./Stages/Stage4.sh ${env.custom_var}"
                    }
            
                }
            }    
        }
    }    
}
