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
                        bat './Stages/Stage1.bat'
                        echo "$nums"
                    }
            
                }
                stage('Stage generate number') {
                    agent {
                        label "windows"
                    }
                    steps {
                        script {
                            dv = load "./Stages/Stage2.groovy"
                            LARSON = dv.buildRandom()
                            echo "${params.LARSON}"
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
                            println("disk_size = ${disk_size}")
                        }
                        sh "chmod +x ./Stages/Stage4.sh"
                        sh "./Stages/Stage4.sh ${nums}"
                        
                    }
            
                }
            }    
        }
    }    
}
