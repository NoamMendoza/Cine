# Usa una imagen base de OpenJDK en Ubuntu
FROM openjdk:21-jdk-slim

#Instala curl
RUN apt-get update && apt-get install -y curl

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado por Gradle
COPY build/libs/gateway-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]