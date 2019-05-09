./gradlew bootJar
echo "docker build -f ./Dockerfile-armhf . -t userservice:armhf"
docker build -f ./Dockerfile-armhf . -t userservice:armhf
echo "docker build . -t userservice:intel"
docker build . -t userservice:intel