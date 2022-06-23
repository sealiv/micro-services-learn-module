FROM java:8-jre-alpine

VOLUME /tmp

LABEL description="Two-API module"

COPY target/two-api-0.0.1-SNAPSHOT.jar /two-api-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/two-api-0.0.1-SNAPSHOT.jar" ]
