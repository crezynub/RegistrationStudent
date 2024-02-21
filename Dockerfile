FROM adoptopenjdk:21-jre-hotspot
COPY target/my-application.jar my-application.jar
ENTRYPOINT ["java", "-jar", "RegistrationStudent.jar"]