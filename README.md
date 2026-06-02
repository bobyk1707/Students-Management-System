# Student Management System

Project Link -- https://www.linkedin.com/posts/boby17_java-springboot-springmvc-activity-7467692033487564801-CxzT?utm_source=share&utm_medium=member_desktop&rcm=ACoAAD8ozWkBuzmcmfX4WuOplAzYe879ky5KcrE 


A web-based Student Management System built using Spring Boot, Spring MVC, Thymeleaf, Spring Data JPA, Hibernate, MySQL, and Bootstrap. The application provides a simple and user-friendly interface to manage student records with CRUD (Create, Read, Update, Delete) operations.

## Features

* Add new students
* View all students
* Update existing student details
* Delete student records
* Responsive UI using Bootstrap
* Database integration using MySQL
* MVC architecture using Spring Boot and Thymeleaf

## Technologies Used

### Backend

* Java 17+
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

### Frontend

* Thymeleaf
* HTML5
* CSS3
* Bootstrap 4

### Database

* MySQL

### Build Tool

* Maven

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.StudentsManagementSystem
│   │       ├── controller
│   │       ├── entity
│   │       ├── repository
│   │       ├── service
│   │       └── serviceImpl
│   ├── resources
│   │   ├── templates
│   │   └── application.properties
│   └── static
```

## Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE student_management;
```

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.thymeleaf.cache=false
```

## Installation & Setup

### Clone the Repository

```bash
git clone https://github.com/your-username/student-management-system.git
```

### Navigate to Project Directory

```bash
cd student-management-system
```

### Install Dependencies

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/student-management-system.jar
```

### Access the Application

Open your browser and visit:

```text
http://localhost:8081/students
```

## Application Screenshots

### Student List Page

Displays all students with options to update or delete records.

### Add Student Page

Allows users to add new student details.

### Update Student Page

Allows editing of existing student information.

## CRUD Operations

| Operation | Description             |
| --------- | ----------------------- |
| Create    | Add a new student       |
| Read      | View all students       |
| Update    | Modify student details  |
| Delete    | Remove a student record |

## Future Enhancements

* Student Search Functionality
* Pagination and Sorting
* User Authentication & Authorization
* REST API Integration
* Cloud Deployment (AWS / Render)
* Docker Support
* Student Profile Images

## Learning Outcomes

Through this project, I gained practical experience in:

* Spring Boot Application Development
* MVC Architecture
* Dependency Injection
* Spring Data JPA & Hibernate
* Thymeleaf Templating Engine
* Database Integration with MySQL
* CRUD Operations
* Git & GitHub Version Control

## Author

**Boby Kumari**

* B.Sc. Information Technology
* Java Developer | Full Stack Developer | AWS Cloud Practitioner

## License

This project is created for educational and learning purposes.
