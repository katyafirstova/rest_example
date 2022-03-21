FROM java:8
VOLUME /tmp
ADD springboot-docker-1.0.jar /avaos.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar", "avaos.jar"]
