# Blog API

This is a Spring Boot API for a blog platform that includes user authentication, posts, and comments. The project uses JWT for authentication and PostgreSQL as the database, managed via Docker.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features
- JWT Authentication
- User registration and login
- Create, read, update, and delete posts
- Create, read, update, and delete comments on posts

## Technologies Used
- Spring Boot
- PostgreSQL
- Docker
- JWT

## Getting Started

### Prerequisites
- Java 11 or higher
- Docker and Docker Compose
- Maven

### Installation

1. **Clone the repository**
    ```bash
    git clone https://github.com/yourusername/blog-api.git
    cd blog-api
    ```

2. **Build the project**
    ```bash
    mvn clean install
    ```

3. **Set up the database**
   Ensure Docker is installed and running on your machine. Navigate to the `resources` directory and start the PostgreSQL container using Docker Compose.
    ```bash
    cd src/main/resources
    docker-compose up -d
    ```

### Running the Application

1. **Run the Spring Boot application**
    ```bash
    mvn spring-boot:run
    ```

2. The application will start and be accessible at `http://localhost:8080`.

## API Endpoints

### Authentication
- **POST** `/api/auth/register` - Register a new user
- **POST** `/api/auth/login` - Authenticate a user and return a JWT

### Users
- **GET** `/api/users` - Get a list of all users
- **GET** `/api/users/{id}` - Get details of a specific user
- **PUT** `/api/users/{id}` - Update user details
- **DELETE** `/api/users/{id}` - Delete a user

### Posts
- **GET** `/api/posts` - Get a list of all posts
- **GET** `/api/posts/{id}` - Get details of a specific post
- **POST** `/api/posts` - Create a new post
- **PUT** `/api/posts/{id}` - Update a post
- **DELETE** `/api/posts/{id}` - Delete a post

### Comments
- **GET** `/api/posts/{postId}/comments` - Get all comments for a specific post
- **POST** `/api/posts/{postId}/comments` - Add a comment to a post
- **PUT** `/api/comments/{id}` - Update a comment
- **DELETE** `/api/comments/{id}` - Delete a comment

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Make sure to update tests as appropriate.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
