def call(String project, String hubUser) {
    sh "trivy image ${hubUser}/${project}:latest > scan.txt"
}