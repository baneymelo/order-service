#!/bin/bash

set -o errexit
set -o noglob
set -o nounset
set -o pipefail

echo 'IMAGE_DOCKER: ' $IMAGE_DOCKER
docker build -t $IMAGE_DOCKER .
docker push $IMAGE_DOCKER