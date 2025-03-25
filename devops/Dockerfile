FROM eclipse-temurin:21-jdk
VOLUME /tmp
EXPOSE 9090
ADD ./build/libs/devops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]