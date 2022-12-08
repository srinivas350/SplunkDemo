FROM openjdk:11
EXPOSE 8080
ADD target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","/dockerdemo.jar"]