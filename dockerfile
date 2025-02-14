# Use an official OpenJDK runtime as base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose the port the app runs on (default Spring Boot port)
EXPOSE 9000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
