# 📚 Library Management System (Backend API)

A robust, enterprise-grade RESTful backend application built with Java and Spring Boot. This serves as the core engine for the Library Management System MVP, handling business logic, member operations, data persistence, and inventory tracking.



## THIS IS BOOK CATALOGUE 

<img width="820" height="299" alt="image" src="https://github.com/user-attachments/assets/d58c0b11-3a66-4b4b-9e3e-f1bf1d498ff8" />

## THIS IS MEMBER ALOTTMENT DASHBAORD

<img width="947" height="422" alt="Screenshot 2026-07-19 160314" src="https://github.com/user-attachments/assets/1652a53f-4625-44cc-92d5-2bf5d0fd1295" />


## 🚀 Core Features

- **Book Inventory Operations:** Full CRUD APIs to manage books (add new arrivals, update details, search by titles/authors, and handle cataloging).
- **Member Management:** Comprehensive tracking of library members, registration records, and active profiles.
- **Layered Architecture:** Strict separation of concerns using the standard Controller-Service-Repository pattern for scalability and easy maintenance.
- **Database Automation:** Structured data mapping using Hibernate/JPA to manage relational entities smoothly.

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot 3.x (Spring Web, Spring Data JPA)
- **Build Tool:** Maven
- **Database:** PostgreSQL / MySQL (or H2 for local memory testing)

## 📁 Project Architecture & Layout

The codebase is modularly organized under the `com.testing.testing` package:

```text
├── .mvn/wrapper              # Maven Wrapper files
├── src/
│   ├── main/
│   │   ├── java/com/testing/testing/
│   │   │   ├── controller/   # REST Endpoints (BookController, MemberController)
│   │   │   ├── service/      # Business Logic & Rules (BookService, MemberService)
│   │   │   ├── repository/   # Database Access Layers (BookRepository, MemberRepository)
│   │   │   ├── entity/       # Database Models (BookEntity, MemberEntity)
│   │   │   └── TestingApplication.java  # Main Application Entry Point
│   │   └── resources/
│   │       └── application.properties   # App Environment Configurations
└── pom.xml                   # Maven Dependencies & Plugins configuration
