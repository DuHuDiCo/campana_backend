FROM openjdk:11
COPY "./target/campana_backend-0.0.1-SNAPSHOT.jar" "campana_backend.jar"
EXPOSE 80
ENTRYPOINT ["java", "-jar", "campana_backend.jar"]

