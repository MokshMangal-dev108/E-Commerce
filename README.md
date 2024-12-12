# E-Commerce Platform

## Overview
The E-Commerce Platform is a comprehensive and secure online shopping system designed to streamline product sales and purchases. Built with Spring Boot, Java, SQL, and ReactJS, this project includes robust features for managing users, orders, and products, with dedicated admin and user functionalities.

## Features

### User Features
- **Product Browsing:** Users can browse through various products with detailed descriptions, prices, and images.
- **Search and Filters:** Search products by name and filter by category, price range, or other criteria.
- **Shopping Cart:** Add products to a cart for seamless checkout.
- **Order Placement:** Place orders with real-time payment processing via the PayPal API.
- **Order Tracking:** Monitor the status of placed orders (e.g., pending, shipped, delivered).

### Admin Features
- **Product Management:** Admins can add, update, and remove products, including setting categories and prices.
- **Order Management:** View, update, and manage orders placed by users.
- **User Management:** Oversee user accounts and their activities.
- **Dashboard:** Gain insights into sales, order trends, and user engagement.

## Security
- **JWT Authentication:** Ensures secure user authentication and authorization.
- **Secure Payments:** Payments are processed securely through the PayPal API.

## Tech Stack
- **Backend:** Spring Boot, Java
- **Frontend:** ReactJS
- **Database:** SQL (MySQL)
- **Payment Gateway:** PayPal API
- **Authentication:** JWT Tokens

## Requirements
To run this project, ensure you have the following installed:
- **Java** (version 8 or higher)
- **Maven** (for managing dependencies and building the project)
- **MySQL** (or any SQL-compatible database)
- **Node.js and npm** (for the ReactJS frontend)
- **PayPal Developer Account** (to obtain API credentials)

## Installation Instructions

### 1. Backend Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ecommerce-platform.git
   cd ecommerce-platform/backend
   ```
2. Update database configurations in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
3. Build and run the backend:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### 2. Frontend Setup
1. Navigate to the frontend directory:
   ```bash
   cd ../frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the ReactJS development server:
   ```bash
   npm start
   ```

### 3. Database Setup
1. Create a MySQL database:
   ```sql
   CREATE DATABASE ecommerce;
   ```
2. Run the backend to allow Spring Boot to auto-create the required tables:
   ```bash
   mvn spring-boot:run
   ```

### 4. PayPal Integration
1. Create a developer account at [PayPal Developer](https://developer.paypal.com/).
2. Generate Client ID and Secret from the PayPal Developer Dashboard.
3. Add the credentials to `application.properties` in the backend project:
   ```properties
   paypal.client.id=your_client_id
   paypal.client.secret=your_client_secret
   paypal.mode=sandbox
   ```
   Replace `your_client_id` and `your_client_secret` with the actual credentials from PayPal. Set `paypal.mode` to `sandbox` for testing or `live` for production.

## How to Use

### Launch the Application
1. Start the backend server:
   ```bash
   cd backend
   mvn spring-boot:run
   ```
2. Start the frontend server:
   ```bash
   cd ../frontend
   npm start
   ```
3. Open the application in your browser at `http://localhost:3000`.

### User Workflow
1. Sign up and log in.
2. Browse products, add them to the cart, and proceed to checkout.
3. Track your orders via the user dashboard.

### Admin Workflow
1. Log in as an admin.
2. Manage products, orders, and users via the admin dashboard.

## Future Enhancements
- **Multi-Payment Gateway Support:** Add support for additional payment methods like Stripe or Razorpay.
- **Analytics Dashboard:** Provide advanced sales and user behavior insights.
- **AI-Powered Recommendations:** Enhance user experience with personalized product recommendations.
- **Real-Time Order Notifications:** Notify users about order status updates via push notifications.

---
This E-Commerce Platform is a robust foundation for any online store, offering scalability and customizability to meet evolving business needs.

