# ZipBoard QA Assignment – Automation Framework

## Repository Link:

[https://github.com/Aman9392/ZipBoard-QA-Assignment](https://github.com/Aman9392/ZipBoard-QA-Assignment)

---

## Overview:

This repository contains the Selenium Automation Framework created for testing the **Login Feature** of zipBoard's demo web application as part of the QA Specialist assignment.

---

## Tech Stack:

* **Programming Language:** Java
* **Automation Framework:** Selenium WebDriver
* **Test Runner:** TestNG
* **Build Tool:** Maven
* **Browser:** Google Chrome

---

## Folder Structure:

```
ZipBoard-QA-Assignment/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/          # Page Object Model classes
│   │
│   └── test/
│       └── java/
│           └── tests/          # Test Cases (TestNG)
│
├── pom.xml                     # Maven Project Configuration
├── testng.xml                  # TestNG Suite File
└── README.md                   # Project Documentation
```

---

## Test Cases Automated:

1. **Valid Login Test**
2. **Invalid Email Format Validation Test**
3. **Blank Username and Password Validation Test**
4. **Short Password Length Validation Test**
5. **Forgot Password Link Navigation Test**

---

## How to Run the Tests:

1. **Clone the Repository:**

```bash
git clone https://github.com/Aman9392/ZipBoard-QA-Assignment.git
cd ZipBoard-QA-Assignment
```

2. **Prerequisites:**

* Java 11+
* Maven installed
* Chrome Browser & ChromeDriver setup

3. **Run Tests using Maven:**

```bash
mvn clean test
```

---

## Test Report:

* Test execution results can be viewed in the console output.
* After execution on local, you will find the test report in the file path below 
* Full test report is in the Target folder path - target/surefire-reports/surefire suite/index.html

---

## Bugs Identified:

* Valid Login fails despite correct credentials.
* Missing validation for email format.
* Blank fields are not handled with proper validation.
* Password length validation is missing.
* Forgot Password link does not navigate (href="#").

Detailed bug report has been provided separately.

---

## Author:

Aman Pawar

---

End of README
