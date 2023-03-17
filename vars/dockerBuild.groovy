// def call(String project, String hubUser) {
//     sh "docker image build -t ${hubUser}/${project} ."
//     sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}"
//     sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:latest"
// }


def call(String hubUser, String region, String aws_account_id) {
    sh "docker build -t ${hubUser} ."
    sh "docker tag ${hubUser}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${hubUser}:latest"
}