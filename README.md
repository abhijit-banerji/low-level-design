# 🌍 World Without Command Design Pattern

This section outlines the challenges faced when an application is not structured using the **Command Design Pattern**.

---

### ❌ Lack of Abstraction
Today, the *process of turning on an AC* is simple, but if there are more steps, the client has to be aware of all of them — which is **not good**.

### 🔁 Undo/Redo Functionality
What if I want to implement the undo/redo capability?  
**How will it be handled?**

### 🧩 Difficulty in Code Maintenance
What if in the future, we have to support **more commands for more devices**, for example, a bulb?  
This can make the codebase harder to scale and maintain.
