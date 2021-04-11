FROM azul/zulu-openjdk-alpine:14

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} recipe-service.jar
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo:27017/name_of_your_db", "-Djava.security.egd=file:/dev/./urandom","-jar", "/recipe-service.jar"]