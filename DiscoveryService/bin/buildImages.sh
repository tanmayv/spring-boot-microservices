./gradlew bootJar
echo "docker build -f ./Dockerfile-armhf . -t discoveryservice:armhf"
docker build -f ./Dockerfile-armhf --platform armhf . -t discoveryservice:armhf
echo "docker build . -t discoveryservice:intel"
docker build . -t discoveryservice:intel
