FROM openjdk:21-jdk-slim

COPY /target/order-service-1.0.0.jar ./order-app.jar

CMD ["java","-jar","./order-app.jar"]