FROM amazoncorretto:17

#ARG JAR_FILE=target/*.jar

WORKDIR /app

COPY target/UniversityPortal-0.0.1-SNAPSHOT.jar /app/UniversityPortal-0.0.1-SNAPSHOT.jar

CMD apt-get update -y

ENTRYPOINT ["java", "-jar", "UniversityPortal-0.0.1-SNAPSHOT.jar"]

