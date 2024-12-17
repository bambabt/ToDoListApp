# Use OpenJDK image
FROM openjdk:17-jdk-slim

# Set the application JAR
ARG JAR_FILE=target/todolist-0.0.1-SNAPSHOT.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} app.jar

# Expose the port for the application
EXPOSE 8080

# Run the application 
ENTRYPOINT ["java", "-jar", "/app.jar"]