FROM amazoncorretto:17
ARG JAR_FILE=build/libs/KULEUM_BRIDGE_SERVER.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]