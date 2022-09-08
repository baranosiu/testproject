FROM maven:3-jdk-11-slim
ADD ./ /usr/src/maven
WORKDIR /usr/src/maven
CMD ["sh","./run.sh"]