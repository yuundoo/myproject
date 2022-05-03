FROM openjdk:11
CMD ["./mvnw", "clean", "package"]
EXPOSE 8006
ARG JAR_FILE_PATH= MyBatisOraclePractice-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE_} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]