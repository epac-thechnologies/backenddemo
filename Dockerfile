FROM openjdk:latest
EXPOSE 8031
ADD target/OrdreArchive.jar OrdreArchive.jar

ENTRYPOINT ["java","-jar","/OrdreArchive.jar"]
