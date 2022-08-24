FROM amazoncorretto:11
EXPOSE 8080
ADD target/devOps_testing.jar devOps_testing.jar
ENTRYPOINT ["java","-jar", "/devOps_testing.jar"]