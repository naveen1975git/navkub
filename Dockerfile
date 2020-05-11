FROM openjdk:11-jre-alpine
ARG JAR_FILE=target/kubservice.jar
COPY ${JAR_FILE} /opt/module/app.jar
RUN chgrp -R 0 /opt && chmod -R g=u /opt
EXPOSE 8080
CMD [ "-jar", "/opt/module/app.jar" ]
ENTRYPOINT ["java"]