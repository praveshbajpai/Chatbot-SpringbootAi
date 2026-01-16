# Chatbot Platform – Architecture & Design

## Overview
The Chatbot Platform is a Spring Boot–based backend application that provides
secure user authentication and AI-powered chat functionality using a free
Large Language Model (LLM) API via OpenRouter.

The application exposes RESTful APIs that can be tested using tools such as
Postman. No frontend UI is included in the current version.

---

## High-Level Architecture

API Client (Postman)
        |
        v
Spring Boot REST API
        |
        +-- Authentication Module (JWT Security)
        |
        +-- Chat Module (LLM Integration)
        |
        v
MySQL Database

---

## Components

### 1. Controller Layer
- AuthController  
  Handles user registration and authentication.  
  Generates JWT tokens upon successful login.

- ChatController  
  Accepts user chat messages via REST API.  
  Returns AI-generated responses from the LLM service.

---

### 2. Service Layer
- AuthService  
  Contains business logic for user registration and login.  
  Encrypts passwords using BCrypt.  
  Generates and validates JWT tokens.

- ChatService  
  Integrates with the OpenRouter LLM API.  
  Sends user prompts to the configured LLM model.  
  Parses and returns AI-generated responses.

---

### 3. Repository Layer
- UserRepository  
  Manages database operations using Spring Data JPA.  
  Performs CRUD operations on user entities.

---

### 4. Security
- JWT-based authentication and authorization.
- Passwords stored securely using BCrypt hashing.
- Stateless session management for better scalability.

---

### 5. External Integration
- OpenRouter LLM API
- Model Used: mistral-7b-instruct
- REST-based communication using HTTP requests.

---

## Design Principles
- Layered architecture for maintainability.
- Separation of concerns across application layers.
- RESTful API design standards.
- Secure handling of credentials and sensitive data.

---

## Future Enhancements
- Persist chat history in the database.
- Add API rate limiting.
- Implement role-based access control (RBAC).
- Improve logging, monitoring, and error handling.

---

## Summary
This application demonstrates a secure and scalable backend chatbot platform
built using Spring Boot, JWT security, MySQL, and a free LLM API integration.
It is designed to be easily extensible for future enhancements.
