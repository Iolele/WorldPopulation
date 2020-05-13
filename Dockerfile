FROM openjdk:13

ADD target/demo-0.0.1-SNAPSHOT.jar app.jar

COPY . .

ENTRYPOINT ["java", "-jar", "demo.jar"]

EXPOSE 7777