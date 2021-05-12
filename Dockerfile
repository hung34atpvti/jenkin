FROM adoptopenjdk/openjdk11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
#ARG BOOTSTRAP_YML=target/classes/bootstrap.yml
#COPY ${BOOTSTRAP_YML} bootstrap.yml
ENTRYPOINT ["java","-jar","/app.jar"]
#"-Dspring.cloud.bootstrap.location=/bootstrap.yml"