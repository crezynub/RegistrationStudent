FROM openjdk:11
EXPOSE 8080
COPY target/your-application.jar your-application.jar
ENTRYPOINT ["java","-jar","/your-application.jar"]
