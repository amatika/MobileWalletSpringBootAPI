## Spring Boot Backend Setup and Postman Testing Guide

This section explains how to set up the **Spring Boot backend** for the Mobile Wallet application and how to test the APIs using the **Postman collection provided in the project folder**.

---

## Prerequisites

Ensure you have the following installed:

- **Java JDK 17 or above**
- **Maven** or **Gradle**
- **Eclipse IDE**
- **Postman**
- **Ngrok** (for exposing localhost if needed by the mobile app)

## Backend Setup (Spring Boot – Eclipse)

### Import into Eclipse

1. Open **Eclipse** after cloning the repository from the url: https://github.com/amatika/MobileWalletSpringBootAPI
2. Go to **File → Import**
3. Select **Maven → Existing Maven Projects**
4. Browse to the backend project folder
5. Ensure `pom.xml` is detected
6. Click **Finish**

### Run the Backend

- Locate the main class annotated with `@SpringBootApplication`
- Right-click → **Run As → Spring Boot App or Run As Java Application**

## 8. Testing Backend with Postman

1. Open Postman
2. Import the collection from:
   ```
   /postman/mobile-wallet.postman_collection.json
   ```
3. Set the environment base URL to your Ngrok URL or use the preset base url in the postman collection
4. Test login, balance, send money, and statements

---
