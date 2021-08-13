def dv
def nums
pipeline {
    agent none
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
        string(name: 'LARSON', defaultValue: '', description: 'Nobody')
    }    
    stages {
        stage('Run Stages') {
            parallel {
                stage('Stage batch') {
                    agent {
                        label "windows"
                    }
                    steps {
                        sleep 10
                        bat './Stages/Stage1.bat'
                        echo "Pirmas $nums"
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
                        sh "sleep 5"
                        sh "chmod +x ./Stages/Stage4.sh"
                        sh "./Stages/Stage4.sh ${nums}"
                        
                    }
                }
            }    
        }
    }    
}
