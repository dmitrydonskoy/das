FROM openjdk:17-jdk
ADD target/beatysalon-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m","-jar", "-Dspring.profiles.active=dev", "/app/beatysalon-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080