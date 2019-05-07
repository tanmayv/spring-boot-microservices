./gradlew bootJar
echo "docker build -f ./Dockerfile-armhf . -t authservice:armhf"
docker build -f ./Dockerfile-armhf . -t authservice:armhf
echo "docker build . -t authservice:intel"
docker build . -t authservice:intel