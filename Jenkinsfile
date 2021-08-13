def dv
def nums
pipeline {
    agent none   
    stages {
        stage('Run Stages in Parallel') {
            parallel {
                stage('Stage Build Number') {
                    agent {
                        label "windows"
                    }
                    steps {
                        bat './Stages/Stage1.bat'
                    }
            
                }
                stage('Stage generate number') {
                    agent {
                        label "windows"
                    }
                    steps {
                        script {
                            dv = load "./Stages/Stage2.groovy"
                            nums = dv.buildRandom()
                            echo "Antras $nums"
                        } 
                    }
                }
                stage('Stage Print Random') {
                    agent {
                        label "linux"
                    }
                    steps {
                        script {
                            def disk_size = sh (script: "df / --output=avail | tail -1", returnStdout: true).trim() as Integer
                            println("disk_size = $nums")
                        }
                        sh "chmod +x ./Stages/Stage4.sh"
                        sh "./Stages/Stage4.sh ${nums}"
                        
                    }
                }
            }    
        }
    }    
}
