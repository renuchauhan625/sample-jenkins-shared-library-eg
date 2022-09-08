def call(int buildNumber){
    if (buildNumber%2==0){
        pipeline{
            agent any
            stages{
                stage("even number"){
                    steps{
                        echo "the Buildnumber is even"
                    }
                }
            }
        }
    }
else{
    pipeline{
        agent any
        stages{
            stage("odd number"){
                steps{
                    echo "The Build number is Odd"
                }
            }
        }
        
    }
}
}
