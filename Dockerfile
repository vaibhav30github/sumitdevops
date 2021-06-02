FROM openjdk:16
ARG JAR_FILE=build/libs/demo-1.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]