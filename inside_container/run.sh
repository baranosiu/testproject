#!/bin/sh
mvn clean
mvn package
java -jar ./target/fibo-1.0-jar-with-dependencies.jar
