# Rock-Scissor-And-Paper
This is the game of Rock , Scissor and paper where player can pass the Rock/scissor/paper and computer automatically generate your value and then it return Winner name.


# WeatherProject

![Logo](https://user-images.githubusercontent.com/104360276/221820586-f17ee6ff-a131-4ea1-91e2-849fab5b250d.jpeg)

This is a basic weather project where we pass a pincode and the date and it will return the weather details like rain,clouds,temp,min_temp,max_temp,feel-Like,sunset,sunrise,etc-etc.
there is only one user : user who can search weather for particular location.

## ER Diagram

![ER diagrame](https://user-images.githubusercontent.com/104360276/221812995-4469cb98-9005-42b3-84c9-2cd5f1c99a63.png)
/view)


## Features
 - user can search weather details for particular location and particular date, project will return weather details for that locations

## Tech Stack

- Core Java
- Spring Boot
- Hibernate
- MySQL (RDBMS)
- Sql
- Maven
- Swagger UI
- postman
- Intellij Idea
- Giuhub


## Deployment

To deploy this project on localhost paste this below code in application.properties file in the 
resources and update according to your database name, username and password of your MySQL database.

```properties
 #changing the server port
server.port=8080

#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/database
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=username
spring.datasource.password=password



#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

```
### Swagger UI - Link

Use this link to run it on browser.
```swagger
http://localhost:8080/swagger-ui
```

## Authors
- [Pradeep Singroul (@pradeepsingroul) ](https://github.com/pradeepsingroul)
