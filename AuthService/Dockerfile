FROM java:8
EXPOSE 8080
ADD /build/libs/AuthService-0.0.1-SNAPSHOT.jar target.jar
ENTRYPOINT ["java", "-jar", "target.jar"]
