FROM amazoncorretto:17.0.7
WORKDIR /app
COPY /target/movie-0.0.1-SNAPSHOT.jar uygulama.jar
EXPOSE 8080
CMD ["java", "-jar", "uygulama.jar"]