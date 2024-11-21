FROM amazoncorretto:21-alpine-jdk
MAINTAINER ESMERALDA
COPY target/demoRelaxUp-0.0.1-SNAPSHOT.jar RelaxupBackend.jar
ENTRYPOINT ["java", "-jar","/RelaxupBackend.jar"]
