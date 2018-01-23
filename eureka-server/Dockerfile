FROM java:8

VOLUME /tmp
ADD target/gateway.jar /gateway.jar
ENV JAVA_OPTS=""

#CMD java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /gateway.jar
#RUN bash -c 'touch /gateway.jar'
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
