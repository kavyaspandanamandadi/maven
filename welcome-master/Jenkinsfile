#!groovy
node ("master") {
    checkout scm
    stage "stage1:clean,test"
	sh 'chmod +x ./gradlew'
       	sh './gradlew clean test'

    stage "stage2:archive,store"       
	sh './gradlew war storeWar'
}
