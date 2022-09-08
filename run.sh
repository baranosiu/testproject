#!/bin/sh
mvn clean package
java -jar target/fibo-1.0-jar-with-dependencies.jar
