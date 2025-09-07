# 💱 Valuto — Currency Converter

Valuto is a **full-stack currency converter app** built with **React.js** (frontend) and **Spring Boot with Java 21** (backend).  
It allows users to **convert currency values between international standards in real-time** with a clean, responsive UI.

## 🚀 Features
- 🌍 Convert between multiple international currencies  
- ⚡ Real-time, accurate conversion  
- 🎨 Responsive and clean UI with React Hooks  
- 🔗 Robust REST API built with Spring Boot  
- ☁️ Cloud-deployed frontend & backend  
- 🔐 Environment variable configuration for secure API URLs  
## 🛠️ Tech Stack
**Frontend:** React.js, React Hooks, CSS  
**Backend:** Java 21, Spring Boot (REST API)  
**Deployment:** Vercel (frontend), Heroku (backend)  
**Others:** REST APIs, JSON parsing, CORS handling  

## 🏗️ Architecture
- **Frontend (`valuto`)**: React Single Page Application (SPA)  
- **Backend (`backend`)**: Spring Boot REST API  
- **Communication:** REST calls with query parameters  

## ⚙️ Installation & Setup

### 1️⃣ Backend (Spring Boot)
```bash
# Clone the repository
git clone https://github.com/your-username/valuto.git
cd valuto/backend

# Build & run
./mvnw spring-boot:run

### 2️⃣ Frontend (React)

```bash
cd valuto/frontend

# Install dependencies
npm install

# Run locally
npm start

### 3️⃣ Deployment

* **Frontend:** Hosted on [Vercel]
* **Backend:** Deployed on [Heroku]
* **Environment Variables:** Used for API URLs

## 🧩 Challenges & Solutions

* **CORS Policy Errors** → Solved with Spring’s `@CrossOrigin` annotation
* **API Response Parsing** → Adjusted frontend parsing methods (JSON ↔ text)
* **Deployment Issues** → Configured environment variables for smooth Vercel + Heroku integration

## 📚 What I Learned

* Full-stack integration with React + Spring Boot
* Handling **CORS** in real-world projects
* Cloud deployment workflows (Vercel + Heroku)
* Working with **asynchronous APIs** and JSON data formats

## 🔮 Future Improvements

* 🌐 Integration with **live exchange rate APIs**
* 📊 Historical charts for currency trends
* 🧪 Unit & integration testing for reliability
* 🎛️ Richer UX with currency selectors

## 👩‍💻 Author

**Niranjani S**
🚀 Aspiring Full-Stack Developer | Passionate about building scalable, user-focused apps

