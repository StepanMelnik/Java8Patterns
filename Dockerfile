# The Docker file to build Maven "java8-patterns" project.

## Build ##
### sudo docker build --no-cache -t "java8patterns:Java8Patterns" .
### sudo docker images -a | grep java8patterns

## Check content ##
### sudo docker image save java8patterns > java8patterns.tar

## Remove failed images with "none" tag ##
### Remove all images with "none" tag or repository
### sudo docker images -a | grep none
### sudo docker rmi --force $(sudo docker images | grep "^<none" | awk '{print $3}')

# Build project
FROM maven:3.6.0-jdk-8-alpine

MAINTAINER Stepan stepan.melnik@gmail.com

LABEL maintainer="stepan.melnik@gmail.com"
LABEL version="0.1"
LABEL description="The Docker image to build Maven Java8-patterns project"

ENV HOME=/home/usr/app
RUN echo "Create '$HOME' folder"
RUN mkdir -p $HOME 

COPY src $HOME
COPY pom.xml $HOME
RUN cat $HOME/pom.xml

COPY settings.xml $HOME/settings.xml
RUN cat $HOME/settings.xml

WORKDIR $HOME

RUN mvn --version

#RUN mvn dependency:go-offline -f pom.xml clean test

RUN mvn -s settings.xml -f pom.xml clean test
RUN mvn -s settings.xml -Dmaven.test.skip=true -f pom.xml package