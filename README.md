# 👨‍💼 Employee Attendance Tracker

A Spring Boot-powered REST API designed to manage employee attendance efficiently. This application allows employees to log their check-in and check-out times, while securely storing attendance data in a PostgreSQL database.

---

## 🛠️ Features

- Create new attendance entries for employees  
- Update check-in and check-out timestamps  
- Retrieve complete attendance records  
- PostgreSQL database integration  
- Developed using Spring Boot, Spring Data JPA, and RESTful principles  

---

## 🚀 Technologies Used

- Java 17  
- Spring Boot 3  
- Spring Web  
- Spring Data JPA  
- PostgreSQL  
- Lombok  
- Maven  

---

## 🗂️ Project Structure

employee-attendance-tracker/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/attendance/
│ │ │ ├── controller/
│ │ │ ├── entity/
│ │ │ ├── repository/
│ │ │ └── EmployeeAttendanceTrackerApplication.java
│ │ └── resources/
│ │ └── application.properties
├── pom.xml
└── README.md

yaml
Copy
Edit

---

## ⚙️ Setup Instructions

### ✅ Prerequisites
- Java 17 or higher  
- Maven  
- PostgreSQL database  
- An IDE such as IntelliJ IDEA or Eclipse  
- Git installed  

### 🔧 Configuration Steps

1. Create a PostgreSQL database (for example, `attendance_db`)  
2. Modify `application.properties` with your database connection details:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/attendance_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
▶️ How to Run
bash
Copy
Edit
# Build and run the application
mvn spring-boot:run
Access the API at: http://localhost:8080/attendance

📫 API Endpoints
Method	Endpoint	Description
POST	/attendance	Add a new attendance record
GET	/attendance	Retrieve all attendance data
PUT	/attendance/{id}	Update an existing record’s check-out time

🙌 Contributors
👩‍💻 Chilakapati Martha Grace

📜 License
This project is licensed under the MIT License — feel free to use, adapt, and share.

