FROM openjdk:8
MAINTAINER Vaibhavi Tikone vaibhavitikone@gmail.com
COPY ./target/trail2-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "trail2-1.0-SNAPSHOT-jar-with-dependencies.jar"]