# 🚀 Spring Cloud Config Server

This project implements a centralized configuration server using Spring Cloud Config Server. It provides externalized configuration management for distributed systems and microservices architecture.

## 📋 Project Overview

- **Java Version**: 21
- **Spring Boot Version**: 3.4.5
- **Spring Cloud Version**: 2024.0.1
- **Default Port**: 8888

## ✨ Features

- Git-backed configuration storage
- Secure access with Basic Authentication
- Health monitoring and metrics endpoints
- Support for application-specific configuration paths
- Automatic git repository synchronization

## 🔧 Technical Details

### 📦 Dependencies

- Spring Cloud Config Server
- Spring Boot Actuator
- Spring Security
- Spring Web

### ⚙️ Configuration

The server is configured with the following key features:

1. **Git Repository Configuration**:
   - Repository URL: https://github.com/diego97f/spring-cloud-config-repo.git
   - Default Branch: master
   - Search Paths: Application-specific folders
   - Auto-clone on startup
   - Forced pull enabled

2. **Security**:
   - Basic Authentication enabled
   - Default username: configadmin (configurable via CONFIG_SERVER_USERNAME)
   - Default password: secretpassword (configurable via CONFIG_SERVER_PASSWORD)

3. **Monitoring**:
   - Exposed endpoints: health, info, env, metrics
   - Detailed health information enabled

## 🔑 Environment Variables

The following environment variables can be configured:

- `SPRING_PROFILES_ACTIVE`: Active Spring profile (default: default)
- `CONFIG_SERVER_USERNAME`: Username for basic authentication
- `CONFIG_SERVER_PASSWORD`: Password for basic authentication

## 🏁 Getting Started

### 📝 Prerequisites

- JDK 21 or higher
- Maven 3.6+ or the included Maven wrapper

### 🛠️ Building the Project

```bash
./mvnw clean install
```

### 🚀 Running the Application

```bash
./mvnw spring-boot:run
```

Or using the jar file:

```bash
java -jar target/spring-cloud-config-server-0.0.1-SNAPSHOT.jar
```

### 🔌 Accessing the Config Server

Configurations can be accessed through the following URL patterns:

- `http://localhost:8888/{application}/{profile}[/{label}]`
- `http://localhost:8888/{application}-{profile}.yml`
- `http://localhost:8888/{label}/{application}-{profile}.yml`

Where:
- `application` is the client application name
- `profile` is the active profile (e.g., dev, prod)
- `label` is the git branch (optional)

## 💉 Health Check

The application's health can be monitored at:
```
http://localhost:8888/actuator/health
```

## 🔒 Security Notes

- It's recommended to change the default credentials in production
- All sensitive information should be provided via environment variables
- The server should be deployed behind a secure proxy in production

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## 👨‍💻 Author

Diego Fernández
