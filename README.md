# Syntecxhub_Student_Registration_System
A console-based **Student Registration System** developed using **Java** and **JDBC** with **MySQL** database.  
This project allows users to perform **CRUD operations** (Create, Read, Update, Delete) on student records.


# Technologies Used
1. Java (Core Java)
2. JDBC (Java Database Connectivity)
3. MySQL
4. Eclipse / IntelliJ IDEA
5. Git & GitHub


# Project Structure
java-->student_registeration_system/ Std_Connection.java/ Student_Register.java/ Registeration_Process.java/ Registeration_Form.java

# Features
1. Add new student
2. View all students
3. Update student details
4. Delete student record
5. Prevent duplicate student IDs
6. Uses PreparedStatement for security  


# Database Details
1. **Database Name:** `syntecxhub`  
2. **Table Name:** `students_register`

# Table Structure

CREATE TABLE students_register (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    age INT,
    course VARCHAR(100)
);

# Learning Outcomes
JDBC CRUD operations

PreparedStatement usage

Exception handling

Modular Java programming

Menu-driven console application

# Internship Task
This project was developed as part of my internship training at @Syntecxhub.

# Author
Nagaraj A

Java Developer (Fresher)
