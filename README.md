# 📂 File Sharing Application

A simple yet secure **File Sharing Application** built with **Java, Spring Boot, Thymeleaf, MySQL, Spring Security, and OAuth**.  
This project allows users to upload, download, and manage files with **authentication and authorization support**.

---

## ✨ Features
- 🔐 **User Authentication & Authorization** with Spring Security + OAuth2
- 📤 **Upload Files** (with metadata saved in MySQL)
- 📥 **Download & Manage Files** securely
- 🗂️ **User Dashboard** for managing uploaded files
- 🗄 **Database Integration** with MySQL for persistence
- 🎨 **Thymeleaf Frontend** for smooth and responsive UI
- ⚡ **Spring Boot Backend** for fast and reliable performance

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot
- **Frontend:** Thymeleaf, HTML5, CSS3, Bootstrap
- **Database:** MySQL (JPA/Hibernate for ORM)
- **Security:** Spring Security, OAuth2
- **Build Tool:** Maven

---

## 🏗️ Project Architecture
```text
FileSharingApp
 ┣ 📂 src/main/java/com/deep/filesharingapp
 ┃ ┣ 📂 config         → Security & OAuth configurations
 ┃ ┣ 📂 controller     → Handles HTTP requests
 ┃ ┣ 📂 model          → Entity classes (User, File, etc.)
 ┃ ┣ 📂 repository     → DAO layer using Spring Data JPA
 ┃ ┣ 📂 service        → Business logic for users & files
 ┃ ┗ 📜 FileSharingApp.java → Main application class
 ┣ 📂 src/main/resources
 ┃ ┣ 📂 templates      → Thymeleaf templates (HTML views)
 ┃ ┣ 📂 static         → CSS, JS, images
 ┃ ┗ 📜 application.properties
 ┗ 📜 pom.xml

🚀 Getting Started
1️⃣ Clone the repository
git clone https://github.com/Deep-Saha1925/File-Sharing-Application.git
cd File-Sharing-Application

2️⃣ Configure Database

Create a database in MySQL (e.g., filesharing_db)

Update application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/filesharing_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the application
./mvnw spring-boot:run


or (if Maven installed globally)

mvn spring-boot:run

4️⃣ Access in browser

👉 http://localhost:8080

🔑 Security

Uses Spring Security for login and role-based access

Supports OAuth2 for third-party login (Google, GitHub, etc.)

Passwords stored securely using BCrypt hashing

📡 API Endpoints (if exposing REST APIs)
Method	Endpoint	Description
GET	/files	List all uploaded files
POST	/files/upload	Upload a new file
GET	/files/{id}/download	Download a specific file
DELETE	/files/{id}	Delete a file
📸 Screenshots

Add UI screenshots here (e.g., Login Page, Dashboard, File Upload Page).
Example placeholders:

🔑 Login Page

🏠 User Dashboard

📂 File Upload UI

📌 Future Enhancements

📎 File size & type restrictions

☁️ Cloud storage integration (AWS S3 / Google Drive)

👥 User-to-user file sharing with permissions

📊 Admin dashboard for monitoring uploads

🔔 Email notifications for uploads/downloads

🤝 Contribution Workflow

Fork the project

Create a feature branch (git checkout -b feature-name)

Commit changes (git commit -m "Added new feature")

Push branch (git push origin feature-name)

Open a Pull Request 🎉

📜 License

This project is licensed under the MIT License.

👨‍💻 Author

Deep Saha
📧 dip23447@gmail.com
🔗 https://github.com/Deep-Saha1925/
🔗 https://www.linkedin.com/in/deep-saha-07575b284/

---
