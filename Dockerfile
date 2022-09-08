FROM maven:3-jdk-11-slim
ADD ./ /usr/src/maven
WORKDIR /usr/src/maven
CMD ["sh","-c","mvn clean; mvn package; java -jar target/fibo-1.0-jar-with-dependencies.jar"]
