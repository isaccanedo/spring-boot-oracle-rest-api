# Spring Boot, Oracle, JPA, Hibernate Rest API Tutorial

Construa a API Restful CRUD para um aplicativo simples de anotações usando Spring Boot, Mysql, JPA e Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Oracle - 12.x.x

## Steps to Setup

**1. Clone the application**

**2. Create Mysql database**
```bash
create database notes_app
```

**3. Altere o nome de usuário e a senha do mysql de acordo com a sua instalação**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/easy-notes-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/notes
    
    POST /api/notes
    
    GET /api/notes/{noteId}
    
    PUT /api/notes/{noteId}
    
    DELETE /api/notes/{noteId}

You can test them using postman or any other rest client.
