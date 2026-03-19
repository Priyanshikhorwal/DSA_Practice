import json
from datetime import datetime

# Load questions
with open("questions.json", "r") as f:
    questions = json.load(f)

total = len(questions)

# Generate table rows
rows = ""
for i, q in enumerate(questions, start=1):
    rows += f"| {i} | {q['date']} | {q['problem']} | {q['platform']} | {q['difficulty']} | [Link]({q['link']}) |\n"

# Generate README content
readme = f"""# 📚 DSA Daily Practice

Welcome to my Data Structures & Algorithms (DSA) journey 🚀  

---

## 📊 Progress Tracker

- 🧠 Total Questions Solved: **{total}**
- 📅 Started On: **{questions[0]['date'] if questions else 'N/A'}**

---

## 🗂️ Questions List

| # | Date | Problem Name | Platform | Difficulty | Link |
|---|------|-------------|----------|------------|------|
{rows}

---

## 💡 Motivation
> Consistency beats intensity.
"""

# Write README
with open("README.md", "w") as f:
    f.write(readme)

print("README updated successfully!")
