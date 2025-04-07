# Usa una imagen base de OpenJDK en Ubuntu
FROM openjdk:21-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado por Gradle
COPY build/libs/estrenos-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8081
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]