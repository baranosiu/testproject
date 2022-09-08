FROM maven:3-jdk-11-slim
ADD ./inside_container /usr/src/maven
WORKDIR /usr/src/maven
CMD ["sh","-c","./run.sh"]
