FROM ubuntu

EXPOSE 8080

RUN apt-get update && apt-get install -y netcat && apt-get install -y openjdk-17-jdk;

COPY /target/gestao-vendas-0.0.2-SNAPSHOT.jar /app/gestao_vendas.jar
COPY /wait-for-mysql.sh /app/wait-for-mysql.sh
WORKDIR /app
# ENTRYPOINT [ "java", "-jar", "/app/gestao_vendas.jar" ]