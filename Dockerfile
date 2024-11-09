# Build stage
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /build/target/demo-0.0.1-SNAPSHOT.jar DynamicAzanRestApplication.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DynamicAzanRestApplication.jar"]
