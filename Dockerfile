# Use the official OpenJDK 17 base image
FROM eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy everything from your repo into the image
COPY . .

# Build the application
RUN ./mvnw clean install -DskipTests

# Run the application
CMD ["./mvnw", "spring-boot:run"]
