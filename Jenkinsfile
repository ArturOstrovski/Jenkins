def groovy1
def groovy2
def random_number
def free_disk_space
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
                        script {
                            def disk_sizez = bat(script: "dir C:/", returnStdout: true).trim()
                            println("disk_size = ${disk_sizez}")
                        }
                        bat './Stages/Stage1.bat'
                    }
            
                }
                stage('Stage Generate Random Number') {
                    agent {
                        label "windows"
                    }
                    steps {
                        script {
                            groovy1 = load "./Stages/Stage2.groovy"
                            random_number = groovy1.buildRandom()
                            echo "Antras $random_number"
                        } 
                    }
                }
                stage('Stage Free Disk Space') {
                    agent {
                        label "windows"
                    }
                    steps {
                        script {
                            groovy2 = load "./Stages/Stage3.groovy"
                            free_disk_space = groovy2.free_Spacesss()
                        } 
                    }
                }
                stage('Stage Print Random Generated Number') {
                    agent {
                        label "linux"
                    }
                    steps {
                        script {
                            def disk_size = sh(script: "df / --output=avail | tail -1", returnStdout: true).trim() as Integer
                            println("disk_size = ${disk_size}")
                        }
                        sh "sleep 5"
                        sh "chmod +x ./Stages/Stage4.sh"
                        sh "./Stages/Stage4.sh ${random_number}"       
                    }
                }
            }    
        }
    }    
}
