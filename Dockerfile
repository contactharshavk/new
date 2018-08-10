
# Start with a base image containing Java runtime
FROM java:8

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 9000

# The application's jar file
ARG JAR_FILE=target/trainingprog-1.0.1-SNAPSHOT.jar

# Add the application's jar to the container  
COPY trainingprog-1.0.1-SNAPSHOT.jar .

# Run the jar file  
ENTRYPOINT ["java","-Djava.security.egd=_file:/dev/./urandom","-jar","trainingprog-1.0.1-SNAPSHOT.jar"]
