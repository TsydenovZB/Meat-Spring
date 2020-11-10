# Meat-Spring
Twitter-like RESTful application on Spring Boot without JS

## Technologies used:
- Project builder: **Maven**
- Registration and authentication: **Spring Security**
- Database: **PostgreSQL**
- Template engine: **Mustache** and  **Freemarker**
- UI: **Bootstrap**
- Also used **Turbolinks** to speed up page rendering

## Structure 
The **_Controller_** package contains the implementation of the Controller from MVС.
The **_domain_** package stores entities that are tables in the database.
The **_repository_** package contains components that implement access to data in the databaseю
The **_domain_** package contains business logic.
The **_configuration_** package contains the configuration of the application

## Database
There are 3 tables stored in the database:
- User (User information)
- Role (Admin / User)
- Message (Message information)
