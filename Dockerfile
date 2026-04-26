FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
RUN javac -d bin src/dsu/*.java src/kruskal/*.java src/main/*.java
CMD ["java", "-cp", "bin", "main.Main"]