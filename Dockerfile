FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/cc-consumer-service.jar cc-consumer-service.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "/cc-consumer-service.jar"]