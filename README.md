
# Hospital Billing Management System

A **Java-based console application** designed to manage and simplify hospital billing and patient information. This system allows healthcare staff to input patient details, assign diseases and specialists, calculate ICU charges, apply GST, and give discounts — generating a complete, transparent bill.

---

## 🚀 Features

- Patient registration and detail input
- Disease-based treatment charges
- Specialist consultation charges
- ICU admission and daily charges
- GST calculation on the total bill
- Discount calculation for eligible bills
- Final bill display with all charges included

---

## 🧮 Billing Logic

- Disease charges vary based on selection
- Specialist consultation charges differ based on expertise
- ICU charges are calculated per day
- GST is applied to bills over ₹5000
- Discount is allowed after GST for qualifying bills

---

## 🛠️ Technologies Used

- Java (Core Java – OOP Concepts)
- Console-based Input/Output
- Interfaces and Inheritance for modularity

---
## 💡 How to Run

1. Clone the repository or download the source files.
2. Compile the Java code:
   ```
   javac HBMS.java
   ```
3. Run the program:
   ```
   java HBMS
   ```
4. Follow the console prompts to test the system.
---

## 📷 Sample Output

```
<img width="405" height="584" alt="Picture1" src="https://github.com/user-attachments/assets/48196354-6c76-4c8a-9e6c-cb01be914828" />
<img width="595" height="407" alt="image" src="https://github.com/user-attachments/assets/366b2991-8582-4996-a173-d1a8ed608a2a" />



```

---

## 📂 Project Structure

- `Hospital` class: Holds all patient and billing details
- `tax` interface: For applying GST
- `maintenance` class: Base hospital maintenance fee
- `one` class (Main): Handles flow for multiple patients

---

## 👨‍💻 Team Members

| Name              | 
|-------------------|
| Sai Swaroop       |
| Mythri J          | 
| Sai Sravan Kumar  |   
| Ragavi M          | 

---

## 📄 License

This project is developed for educational purposes. You may reuse and modify with proper credit to the authors.
