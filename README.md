# 📘 Smart Study Planner (Java)

## 🧠 Overview

The **Smart Study Planner** is a simple Java-based application designed to help students track their daily study hours and analyze their study patterns. It provides basic insights such as identifying overworking (burnout risk) or under-studying habits.

This project aims to promote balanced study routines and improve productivity through simple logic and structured tracking.

---

## 🎯 Objectives

* Track daily study hours
* Analyze study patterns
* Detect burnout and inconsistency
* Encourage balanced study habits

---

## ⚙️ Features

* 📊 Input daily study hours
* 🧮 Analyze study behavior
* ⚠️ Burnout detection (if study hours exceed safe limits)
* 📉 Underperformance alerts
* 📅 Simple and clean console-based interface

---

## 🛠️ Technologies Used

* Java (Core Java)
* Object-Oriented Programming (OOP)
* File Handling (optional for data storage)

---

## 🏗️ Project Structure

```
Study-Planner-Java/
│── src/
│   ├── Main.java
│   ├── Analyzer.java
│   ├── StudySession.java
│── README.md
│── .gitignore
```

---

## 🚀 How to Run the Project

### Step 1: Clone the Repository

```
git clone https://github.com/Atharv-Guptahjg/Study-Planner-Java.git
```

### Step 2: Navigate to Project Folder

```
cd Study-Planner-Java/src
```

### Step 3: Compile the Program

```
javac Main.java
```

### Step 4: Run the Program

```
java Main
```

---

## 💻 Sample Output

```
Enter study hours: 7
Output: Burnout Risk!

Enter study hours: 2
Output: Balanced Study Day.

Enter study hours: 0
Output: You need to study!
```

---

## 🧪 Core Logic

* If study hours > 6 → Burnout Warning
* If study hours < 1 → Underperformance Warning
* Else → Balanced Study

---

## ⚠️ Limitations

* Console-based (no GUI)
* Does not store long-term history (unless extended)
* Basic logic (no advanced machine learning)

---

## 🔮 Future Enhancements

* Add GUI using Java Swing or JavaFX
* Store user data using file handling or database
* Implement weekly/monthly analytics
* Add notification system for reminders

---

## 📚 What I Learned

* Applying Object-Oriented Programming concepts in Java
* Structuring a real-world problem into a working solution
* Writing clean and modular code
* Using GitHub for version control and project management

---

## 👨‍💻 Author

* AtharvGupta
* Course: [Java]
* Institution: VIT Bhopal University

---

## 📜 License

This project is for educational purposes only.
