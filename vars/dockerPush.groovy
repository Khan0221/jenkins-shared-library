// def call(String project, String hubUser) {
//     withCredentials([usernamePassword(
//             credentialsId: "docker",
//             usernameVariable: "USER",
//             passwordVariable: "PASS"
//     )]) {
//         sh "docker login -u '$USER' -p '$PASS'"
//     }
//     sh "docker image push ${hubUser}/${project}:${ImageTag}"
//     sh "docker image push ${hubUser}/${project}:latest"
    
// }


def call(String hubUser, String region, String aws_account_id) {
    sh "aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com"
    sh "docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${hubUser}:latest"
}

