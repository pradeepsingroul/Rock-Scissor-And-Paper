# Rock-Scissor-And-Paper
This is the game of Rock , Scissor and paper where two player exist one is computer and second is user user can pass the Rock/scissor/paper and computer automatically generate your value and then project compares both values and return the winner result based on the game rules.




![360_F_332862747_zb0oXy6txyqlopzJAW3UNQJCPxTg7eUx](https://user-images.githubusercontent.com/104360276/229961021-4d33573e-da1e-40d1-90a3-6c0808b23ec0.jpg)


## ER Diagram
![ER diagrame (1)](https://user-images.githubusercontent.com/104360276/229960730-1a3ea183-d453-4fdd-966b-62e16e4a9a6e.png)

## Features
 - User can register your self and login and then he/she can play the game
 
 ## Rest Api
 
 ```register 
PostMethod-
http://localhost:8080/users
```

```login 
GetMethod-
http://localhost:8080/users/login
```

```Play game 
GetMethod-
http://localhost:8888/users?RcokPapperScissor={your sign}
```
 

## Tech Stack

- Core Java
- Spring Boot
- Spring Security
- MySQL (RDBMS)
- Sql
- Maven
- Swagger UI
- postman
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
