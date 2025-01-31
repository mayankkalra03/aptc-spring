FROM eclipse-temurin:latest AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:latest
COPY --from=build /target/aptc-test-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
