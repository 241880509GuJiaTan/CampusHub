# 阶段 1: 编译
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# 阶段 2: 运行
FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
# 从 build 阶段拷贝编译出的 jar 包
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
