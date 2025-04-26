# crud-employee-rest-api

Purpose:
This is a simple CRUD Employee Rest API project to create, fetch, update, and delete employee’s information on the system/ database based on the authorities/ roles they hold in an organization

## Tech Stack
-	Spring Boot 3
-	Spring Core
-	Spring Data JPA
-	Spring Data Rest
-	Spring Data JDBC
-	Spring Actuator
-	Spring Security
-	Spring AOP
-	MyQSL Database
-	Lambok
-	Maven
-	Java 21
-	Spring Boot Dev Tools

## Tools
-	IntelliJ Community Edition
-	Postman
-	Github
-	Tomcat Server


## Project setup instructions
- Database Development
    - Download and Install MySQL
    - Download and Install MySQL Workbench
    - Run Scripts from the scripts folder
- API Development
    - Download and Install Java JDK 21
    - Download and install IntelliJ Community Edition
    - Run the code
- Testing
  	- Download and Install Postman

### API end points

| HTTP Method | Endpoint | CRUD Action |
| :---         |     :---:      |          ---: |
| `POST`  | `/api/employees` | Create a new employee    |
| `GET`   | `/api/employees` | Read a list of employees |
| `GET`   | `/api/employees/{employeeId}` | Read a single employee |
| `PUT`   | `/api/employees` | Update an existing employee |
| `DELETE`   | `/api/employees/{employeeId}` | Delete an existing employee |

### Actuator end points

| HTTP Method | Endpoint |                      Action |
| :---         |     :---:      |----------------------------:|
| `GET`   | `/actuator/info` |         Read info about API |
| `GET`   | `/actuator/health` |          Read status of API |

## Communication

I hope you have fun with this project as I did creating it. Please share your thoughts based on your experience. What you have learnt or to improve. Connect with me: linkedin: https://www.linkedin.com/in/xola-mkhatshwa-966482a0/ or email: mkhatshwa.xola@gmail.com or [xolamkhatshwa.com](https://xolamkhatshwa.com/) 

Thank you. 

## Authors

[Xola Mkhatshwa](https://github.com/xmkhatshwa) | Software Engineer

mkhatshwa.xola@gmail.com | [xolamkhatshwa.com](https://xolamkhatshwa.com/)
