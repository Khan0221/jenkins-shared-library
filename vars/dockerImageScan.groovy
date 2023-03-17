// def call(String project, String hubUser) {
//     sh "trivy image ${hubUser}/${project}:latest > scan.txt"
// }

def call(String hubUser, String region, String aws_account_id) {
    sh "trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${hubUser}:latest > scan.txt"
}