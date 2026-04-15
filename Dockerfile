FROM eclipse-temurin:17-jdk as builder
WORKDIR /app

COPY . .
RUN chmod +x ./gradlew && ./gradlew build --no-daemon

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

COPY --from=builder /app/build/libs/*.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
