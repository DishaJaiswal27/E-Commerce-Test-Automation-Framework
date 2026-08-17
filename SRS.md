# Software Requirements Specification (SRS)

## 1. Project Overview

### Project Name
E-Commerce Test Automation Framework

### Application Under Test
Demo Web Shop

### Objective
The objective of this project is to develop a scalable BDD-based UI automation framework for testing critical e-commerce workflows.

---

## 2. Technology Stack

- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven
- Git
- GitHub
- Extent Reports
- Log4j2
- Jenkins

---

## 3. Functional Scope

The automation framework will cover the following modules:

- User Login
- Product Search
- Product Details
- Shopping Cart
- Checkout
- Order Placement

---

## 4. End-to-End Scenarios

### E2E-01: Product Search and Cart Validation

Login → Search Product → Product Details → Add to Cart → Verify Cart

### E2E-02: Complete Purchase Flow

Login → Search Product → Product Details → Add to Cart → Checkout → Place Order → Verify Order Confirmation

### E2E-03: Cart and Checkout Validation

Login → Select Product → Add to Cart → Update/Remove Product → Verify Cart → Checkout Validation

---

## 5. Non-Functional Requirements

- Maintainable framework
- Reusable components
- Readable BDD scenarios
- Cross-browser support
- Failure screenshots
- Test execution reports
- Logging
- CI/CD execution

---

## 6. Out of Scope

- API testing
- Database testing
- Performance testing
- Security testing
- Mobile application testing
- Admin module automation

---

## 7. Framework Approach

The framework will follow:

- Page Object Model
- BDD using Cucumber
- Selenium WebDriver
- TestNG
- Data-driven testing
- Reusable utilities
- Centralized configuration
- Reporting and logging
- CI/CD integration