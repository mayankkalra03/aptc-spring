FROM eclipse-temurin:23-jdk AS build

# Install Maven
RUN apt-get update && apt-get install -y maven

# Copy source code
COPY . .

# Build the application
RUN mvn clean package -DskipTests

# Use a lightweight JDK image for runtime
FROM eclipse-temurin:23-jdk-alpine

# Copy the built JAR file from the build stage
COPY --from=build /target/aptc-test-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
