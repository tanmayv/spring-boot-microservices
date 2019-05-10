IMAGE=userservice
docker tag $IMAGE:armhf 12tanmayvijay/$IMAGE:armhf
docker tag $IMAGE:intel 12tanmayvijay/$IMAGE:intel

docker push 12tanmayvijay/$IMAGE:armhf
docker push 12tanmayvijay/$IMAGE:intel

docker manifest create 12tanmayvijay/$IMAGE 12tanmayvijay/$IMAGE:armhf 12tanmayvijay/$IMAGE:intel
docker manifest annotate 12tanmayvijay/$IMAGE:latest 12tanmayvijay/$IMAGE:armhf --os linux --arch arm
docker manifest push --purge 12tanmayvijay/$IMAGE
