def call() {
  sh 'aws ecr-public get-login-password --region ${AWS_REGION} | docker login --username AWS --password-stdin ${ECR_URL}'
  sh 'docker tag ${DOCKER_IMAGE_TAG} ${ECR_IMAGE_TAG}'
  sh 'docker push ${ECR_IMAGE_TAG}'
}
