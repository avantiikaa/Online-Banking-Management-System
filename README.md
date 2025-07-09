# Online-Banking-Management-System

This is a Java-based Online Banking Management System project developed for educational purposes.

## 📋 Features
- User Login
- Create New Account
- Deposit Money
- Withdraw Money
- Check Balance
- Logout

## 💻 Technologies Used
- Java
- MySQL
- NetBeans IDE

## 🛠️ Setup Instructions

### 1. MySQL Setup
- Create the database and table:
  ```sql
  CREATE DATABASE onlinebank;
  USE onlinebank;
  CREATE TABLE users (
      account_number VARCHAR(20) PRIMARY KEY,
      name VARCHAR(100),
      password VARCHAR(100),
      balance DOUBLE
  );
2. Java Setup
Make sure you have MySQL Connector/J added to your project libraries.

Update DBConnection.java with your MySQL password.

3. Running the Application
Compile all Java files.

Run Login.java for authentication.

Use AccountOperations for deposit, withdrawal, and balance checks.

Use CreateAccount to create new accounts.

Use Logout to end the session.
