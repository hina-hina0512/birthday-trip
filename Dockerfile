FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN ls -la src/main/java/com/example/birthdaytrip/
RUN jar tf target/*.jar | grep -i birthdaytrip || echo "見つかりませんでした"

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]