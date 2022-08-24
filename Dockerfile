FROM amazoncorretto:11
EXPOSE 8080
ADD target/devops_testing.jar devops_testing.jar
ENTRYPOINT ["java","-jar", "/devops_testing.jar"]