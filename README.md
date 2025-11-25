# 🎓 Academic Grade Analytics System

![Java](https://img.shields.io/badge/Language-Java%20SE%2021-orange)
![Build](https://img.shields.io/badge/Build-Stable-brightgreen)
![Category](https://img.shields.io/badge/Category-Education%20Tech-blue)

## 📖 Project Overview
The **Academic Grade Analytics System** is a modular Java application designed to automate the calculation of student grades and Cumulative Grade Point Average (CGPA). 

Built with a focus on **Object-Oriented Programming (OOP)** principles, this system simulates a real-world university grading environment. It captures student data, processes subject-wise scores, calculates credits based on the Indian Education System standards, and generates a persistent **Official Academic Transcript**.

---

## 🚀 Key Features
* **Weighted CGPA Calculation:** Computes accurate GPA by factoring in course credits (not just a simple average).
* **Data Persistence:** Automatically generates and saves a `.txt` report file for every student, simulating a database record.
* **Robust Error Handling:** Features a custom `InvalidGradeException` to prevent illogical data entry (e.g., marks < 0 or > 100).
* **Modular Architecture:** The project is split into 7 distinct files (Data, Logic, and Interface layers) to ensure clean code.

---

## 🛠️ Technical Architecture

| File Name | Responsibility |
| :--- | :--- |
| **`Main.java`** | The entry point of the application. Initializes the system. |
| **`GradingManager.java`** | Handles the user interface (Console) and input flow control. |
| **`StudentProfile.java`** | Data model representing the student (Name, RegNo). |
| **`CourseDetails.java`** | Data model representing individual subjects, marks, and credits. |
| **`GradeCalculator.java`** | Contains static logic to convert numerical scores into Letter Grades (S, A, B, etc.). |
| **`ReportGenerator.java`** | Handles File I/O operations to export the final transcript to the local disk. |
| **`InvalidGradeException.java`** | Custom exception class for input validation. |

---

## 💻 How to Run
1.  **Clone the Repository:** Download the source code to your local machine.
2.  **Open in IDE:** Import the folder into **Eclipse** or **IntelliJ IDEA**.
3.  **Compile & Run:** Execute `Main.java` as a Java Application.
4.  **Input Data:** Follow the console prompts to enter student details and course marks.
5.  **View Report:** Once finished, refresh the project folder to view the generated `_Final_Report.txt`.

---

### 📷 Output Preview
*Screenshots of the console execution and final report generation can be found in the `/screenshots` directory.*

> **Note:** This project was developed as part of the academic curriculum to demonstrate proficiency in Java Programming and Software Development Life Cycle (SDLC) concepts.
