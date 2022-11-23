FROM maven:3.8.2-jdk-11

WORKDIR /home/pi

COPY . .
RUN mvn install
CMD mvn spring-boot:run

# COPY target/sHome-0.0.1-SNAPSHOT.jar .

# # RUN java -jar target/sHome-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","sHome-0.0.1-SNAPSHOT.jar"]
