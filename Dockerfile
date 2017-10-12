FROM frolvlad/alpine-oraclejdk8:slim

MAINTAINER victoryw

VOLUME /tmp
ADD build/libs/spring-cloud-example-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch app.jar'
ENV JAVA_OPTS=""
CMD [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]