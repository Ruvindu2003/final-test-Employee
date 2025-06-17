# Build stage
# Build stage
FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app

# Only copy pom.xml first to use Docker cache for dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Then copy the source code
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
