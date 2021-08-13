def groovy1
def groovy2
def random_number
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
                stage('Stage Generate Random Number') {
                    agent {
                        label "windows"
                    }
                    steps {
                        script {
                            groovy1 = load "./Stages/Stage2.groovy"
                            random_number = gr1.buildRandom()
                            echo "Antras $rdnum"
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
                            groovy2.PrintFreeSpace()
                        } 
                    }
                }
                stage('Stage Print Random') {
                    agent {
                        label "linux"
                    }
                    steps {
                        sh "sleep 5"
                        sh "chmod +x ./Stages/Stage4.sh"
                        sh "./Stages/Stage4.sh ${random_number}"       
                    }
                }
            }    
        }
    }    
}
