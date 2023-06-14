FROM openjdk:11
COPY "./target/campana_backend-0.0.1-SNAPSHOT.jar" "campana_backend.jar"
EXPOSE 80
ENTRYPOINT ["java", "-jar", "campana_backend.jar"]

./target/campana_backend-0.0.1-SNAPSHOT.jar




FROM maven:3.8.3-openjdk-11-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim
COPY --from=build ./target/campana_backend-0.0.1-SNAPSHOT.jar /campana_backend.jar
EXPOSE 8080
CMD ["java", "-jar", "/campana_backend.jar"]