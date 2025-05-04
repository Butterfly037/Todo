# Use a JDK base image
#FROM eclipse-temurin:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the jar (replace with your actual jar name if different)
#COPY target/todo-list.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:17
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

