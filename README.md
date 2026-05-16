# 🚀 Order Management API

REST API developed with Java and Spring Boot for order management, featuring JWT authentication and PostgreSQL integration.

## 📌 Features

- Create orders
- List all orders
- Find order by ID
- Update orders
- Delete orders
- JWT Authentication
- PostgreSQL database integration
- Layered architecture (Controller, Service, Repository)

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- PostgreSQL
- Maven

---

## 🔐 Authentication

The API uses JWT authentication.

### Login Endpoint

http POST /auth/login 

### Request Body

json {   "username": "admin",   "password": "123" } 

### Response

json {   "token": "your-jwt-token" } 

---

## 📦 Order Endpoints

### Create Order

http POST /orders 

### Get All Orders

http GET /orders 

### Get Order By ID

http GET /orders/{id} 

### Update Order

http PUT /orders/{id} 

### Delete Order

http DELETE /orders/{id} 

---

## ⚙️ Running the Project

### Clone repository

bash git clone https://github.com/pedrobragga/order-management-api.git 

### Access project folder

bash cd order-management-api 

### Configure environment variable

bash DB_PASSWORD=your_password 

### Run application

bash ./mvnw spring-boot:run 

---

## 👨‍💻 Author

Pedro Braga

- GitHub: https://github.com/pedrobra
