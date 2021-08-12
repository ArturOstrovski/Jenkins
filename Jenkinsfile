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
                            def lariable = bat (script: './Stages/Stage1.bat', returnStdout: true).trim()
                            println ("Some muther... ${lariable}")
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
                        script {
                            def disk_size = sh (script: "df / --output=avail | tail -1", returnStdout: true).trim() as Integer
                            println("disk_size = ${disk_size}")
                        }
                        sh "chmod +x ./Stages/Stage4.sh"
                        sh "./Stages/Stage4.sh ${env.custom_var}"
                        
                    }
            
                }
            }    
        }
    }    
}
