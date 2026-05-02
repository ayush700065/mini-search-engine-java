# 🔍 Mini Search Engine (Java)

## 📌 Overview

This project is a console-based mini search engine built using core Java. It reads multiple text files, creates an inverted index, and allows users to search keywords with ranked results based on frequency.

---

## 🚀 Features

* Inverted Index implementation
* Keyword-based search
* Ranking using word frequency
* Supports multiple text files
* Console-based interaction

---

## 🛠 Tech Stack

* Core Java
* Collections Framework (HashMap, List)
* File Handling

---

## 📂 Project Structure

MiniSearchEngine/
│── Main.java
│── FileLoader.java
│── Indexer.java
│── SearchEngine.java
│── data/
│    ├── file1.txt
│    └── file2.txt

---

## ▶️ How It Works

1. Loads text files from the `data` folder
2. Builds an inverted index (word → file mapping)
3. Accepts user input (search keyword)
4. Displays ranked results based on frequency

---

## ▶️ How to Run

1. Compile:
   javac *.java

2. Run:
   java Main

3. Enter a keyword to search

---

## 📊 Example

Input:
java

Output:
file1.txt (score: 2)
file2.txt (score: 2)

---

## 💡 Future Improvements

* Multi-word search
* Stop-word filtering (like "the", "is")
* TF-IDF ranking
* GUI interface

---

## 👨‍💻 Author

Ayush Rai
