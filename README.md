# 🧠 Spell Correction Engine (Java + Spring Boot)

## 📌 Project Overview
The Spell Correction Engine is a web-based application developed using Java and Spring Boot. It helps users identify and correct misspelled words by suggesting the closest matching words based on the Edit Distance algorithm.

This project demonstrates how string processing and algorithms are applied in real-world applications like search engines, text editors, and AI-based systems.

---

## 🎯 Objectives
- Accept user input (possibly incorrect word)
- Suggest the closest valid words
- Display similarity metrics
- Implement backend logic using Java only
- Build a clean frontend using HTML & CSS

---

## 🚀 Key Features
✔ User-friendly interface  
✔ Real-time spell checking  
✔ Displays multiple suggestions  
✔ Shows Edit Distance for each word  
✔ Calculates similarity percentage  
✔ Fully implemented using Java (no JavaScript)

---

## 🛠️ Technologies Used
- **Java** (Core logic)
- **Spring Boot** (Backend framework)
- **Thymeleaf** (Template engine)
- **HTML5 & CSS3** (Frontend)
- **Maven** (Build tool)

---

## 🧠 Algorithm Used

### 🔹 Edit Distance (Levenshtein Distance)

This algorithm calculates the minimum number of operations required to convert one word into another.

Operations include:
- Insertion
- Deletion
- Substitution

### 📌 Formula Concept:
distance = min(insert,delete,replace)

---

## ⚙️ Project Structure
demo/
│
├── src/
│ ├── main/
│ │ ├── java/com/example/demo/
│ │ │ ├── DemoApplication.java
│ │ │ ├── SpellService.java
│ │ │ └── SpellController.java
│ │ │
│ │ └── resources/
│ │ ├── templates/
│ │ │ └── index.html
│ │ └── application.properties
│
├── pom.xml
└── mvnw

---

## ▶️ How to Run the Project

### Step 1: Clone Repository
git clone https://github.com/your-username/spell-checker-java.git

### Step 2: Navigate to Project
cd spell-checker-java

### Step 3: Run Application
.\mvnw.cmd spring-boot:run
### Step 4: Open Browser
http://localhost:8080

---

## 📸 Output Screens

### 🟢 Input Page
User enters a word.

### 🔵 Result Page
- Displays suggestions
- Shows distance & similarity

*(You can add screenshots here for better presentation)*

---

## 🔍 Example

| Input | Suggestions |
|------|-----------|
| speling | spelling |
| wrd | word |
| jav | java |

---

## 📈 Applications
- Spell checkers
- Search engines
- Text editors
- Chat applications
- AI/NLP systems

---

## ⚠️ Limitations
- Uses static dictionary
- Limited vocabulary size
- Performance depends on dataset size

---

## 🔮 Future Enhancements
- Add large dictionary (5000+ words)
- Use Trie or HashMap for optimization
- Add voice input
- Integrate AI-based correction
- Deploy online (Render / AWS)

---

## 👨‍💻 Author
**Jayasankar Tanguturi**

---

## 📚 Conclusion
This project successfully demonstrates the implementation of Edit Distance algorithm in a real-world web application. It highlights how backend logic and frontend UI can be integrated using Java-based technologies.

---
