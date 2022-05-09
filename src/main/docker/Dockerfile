FROM eclipse-temurin:18
RUN mkdir /opt/app
ADD maven/${project.artifactId}-${project.version}.jar \
  /opt/app/locations.jar
CMD ["java", "-jar", "/opt/app/locations.jar"]