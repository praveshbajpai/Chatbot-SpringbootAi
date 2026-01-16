# Chatbot Platform – Architecture & Design

## Overview
The Chatbot Platform is a Spring Boot–based backend application that provides
user authentication and AI-powered chat functionality using a free LLM API
(OpenRouter).

## High-Level Architecture

Client (Postman / Frontend)
        |
        v
Spring Boot REST API
        |
        +-- Auth Module (JWT Security)
        |
        +-- Chat Module (LLM Integration)
        |
        v
MySQL Database

## Components

### 1. Controller Layer
- `AuthController` – Handles user registration and authentication.
- `ChatController` – Accepts user chat messages and returns AI responses.

### 2. Service Layer
- `AuthService` – Business logic for user registration and password encoding.
- `ChatService` – Communicates with OpenRouter API using REST calls.

### 3. Repository Layer
- `UserRepository` – Manages database operations using Spring Data JPA.

### 4. Security
- JWT-based authentication.
- Passwords stored using BCrypt hashing.
- Stateless session management.

### 5. External Integration
- OpenRouter LLM API
- Model: mistral-7b-instruct

## Design Principles
- Layered architecture
- Separation of concerns
- RESTful API design
- Secure credential handling

## Future Enhancements
- Frontend UI (React)
- Chat history persistence
- Rate limiting
- Role-based access control

