// def call(String project, String hubUser) {
//     sh "docker rmi ${hubUser}/${project}:${ImageTag}"
//     sh "docker rmi ${hubUser}/${project}:latest"
// }


def call(String hubUser, String region, String aws_account_id) {
    sh "${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${hubUser}:latest"
}