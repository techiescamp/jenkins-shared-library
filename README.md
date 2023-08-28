# jenkins_shared_library

# Docker Image Push to Amazon ECR Public Repository

This script demonstrates how to push a Docker image to an Amazon ECR Public repository using Jenkins. It uses the AWS CLI and Docker commands to authenticate, tag, and push the image to the repository.

## Prerequisites

1. Jenkins or any CI/CD tool set up with appropriate permissions to access AWS ECR Public and Docker.

## Usage

1. Replace the placeholders in the script with your actual values:

   ```groovy
   ECR_REPO = 'your_repository_name'
   AWS_REGION = 'your_aws_region'
   DOCKER_IMAGE_TAG = 'your_docker_image:tag'
   ECR_URL = 'your_ecr_url'
   ECR_IMAGE_TAG = "${ECR_URL}/${ECR_REPO}:latest"

## Example

   ```groovy
   ECR_REPO = 'my_custom_repo'
   AWS_REGION = 'us-east-1'
   DOCKER_IMAGE_TAG = 'my-app:1.0'
   ECR_URL = 'public.ecr.aws/c139p7p2'
   ECR_IMAGE_TAG = "${ECR_URL}/${ECR_REPO}:latest"


   
