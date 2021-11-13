FROM java:8
ADD ./target/springboot-mysql-docker-assignment-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
