def call(credentialsId) {
    stage('Quality Gate Status') {
        steps {
            script {
                waitForQualityGate abortPipeline: false, credentialsId: credentialsId
            }
        }
    }
}
