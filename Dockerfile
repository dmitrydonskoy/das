FROM openjdk:17-jdk
ADD target/reportService-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m","-jar", "-Dspring.profiles.active=dev", "/app/reportService-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081