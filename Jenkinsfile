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
                            random_number = groovy1.buildRandom()
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
                            groovy2.free_Space()
                        } 
                    }
                }
                stage('Stage Print Random Generated Number') {
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
