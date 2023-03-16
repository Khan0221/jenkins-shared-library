def call(credentialsId) {
    stage('Static code analysis') {
        steps {
            script {
                withSonarQubeEnv(credentialsId: credentialsId) {
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
