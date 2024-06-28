## Criando Projeto com Maven

````shell
# Inicia o Projeto com Maven
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quick-start -DinteractiveMode=false
````

### Comandos úteis
````shell
# compila o projeto
mvn compile

# roda os testes
mvn test

# cria o .jar da aplicação -> quick-start-maven-1.0-SNAPSHOT.jar 
mvn package

# apaga a pasta target
mvn clean
````

### Instalando dependências

````shell
# add dependency tags from:
# https://mvnrepository.com/artifact/org.hibernate.validator/hibernate-validator/8.0.1.Final

mvn compile
````

### Gerando Javadoc

````shell
 mvn javadoc:javadoc
 
 # generated \quick-start-maven\target\site\apidocs
 # index.html -> javadoc
````

