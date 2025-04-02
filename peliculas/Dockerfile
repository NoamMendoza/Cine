# Usa una imagen base de OpenJDK en Ubuntu
FROM openjdk:21-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

VOLUME /tmp

ARG JAR_FILE=build/libs/*.jar
# Copia el archivo JAR generado por Gradle
COPY ${JAR_FILE} app.jar
# Copia el archivo JAR generado por Gradle
#COPY build/libs/peliculas-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8081
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]