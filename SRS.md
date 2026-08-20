# Software Requirements Specification (SRS)

## 1. Project Overview

### Project Name

E-Commerce Test Automation Framework

### Application Under Test

Demo Web Shop

### Objective

The objective of this project is to develop a scalable and maintainable BDD-based UI automation framework for testing critical e-commerce workflows.

The framework automates user authentication, product search, product selection, shopping cart operations, checkout, and order placement workflows.

---

## 2. Technology Stack

- Java 21
- Selenium WebDriver
- Cucumber BDD
- TestNG
- Maven
- Git
- GitHub
- Extent Reports
- Log4j2

---

## 3. Functional Scope

The automation framework covers the following modules:

- User Login
- User Logout
- Product Search
- Product Details
- Shopping Cart
- Cart Update
- Product Removal
- Checkout
- Order Placement
- Order Confirmation

---

## 4. End-to-End Scenarios

### E2E-01: Product Search and Cart Validation

Login → Search Product → Product Details → Add to Cart → Open Cart → Verify Product

### E2E-02: Complete Purchase Flow

Login → Search Product → Product Details → Add to Cart → Open Cart → Checkout → Enter Billing Details → Complete Checkout → Verify Order Confirmation

### E2E-03: Cart and Checkout Validation

#### Scenario 1: Update Cart and Checkout

Login → Search Product → Add Product → Open Cart → Update Quantity → Verify Cart → Proceed to Checkout → Verify Checkout Page

#### Scenario 2: Remove Product from Cart

Login → Search Product → Add Product → Open Cart → Remove Product → Update Cart → Verify Product Removed

---

## 5. Non-Functional Requirements

- Maintainable framework
- Reusable components
- Readable BDD scenarios
- Page Object Model
- Cross-browser support
- Explicit waits
- Failure screenshots
- Extent Reports
- Log4j2 logging
- Centralized configuration
- Data-driven test execution
- Maven-based execution
- Git/GitHub version control

---

## 6. Framework Architecture

The framework follows a layered architecture:

Feature Files
↓
Step Definitions
↓
Page Objects
↓
Base Page
↓
Utilities / Driver / Configuration

### Major Components

#### Page Object Model

Each application page is represented using a dedicated Page Object class.

#### BasePage

Provides reusable Selenium operations such as:

- Click
- Enter text
- Get text
- Element visibility
- Page information

#### DriverFactory

Responsible for:

- WebDriver initialization
- Browser selection
- Browser configuration
- Driver cleanup

#### ConfigReader

Reads environment and browser configuration from the properties file.

#### Hooks

Responsible for:

- Scenario setup
- Browser initialization
- Application launch
- Extent Report initialization
- Failure screenshots
- Driver cleanup

#### Utilities

Reusable helper classes are used for common framework operations such as explicit waits and logging.

---

## 7. Configuration

Application and browser configuration is maintained externally in:

`src/test/resources/config/config.properties`

Example:

- Browser: Chrome
- Application URL: Demo Web Shop URL

This avoids hardcoding environment-specific configuration in test classes.

---

## 8. Reporting

The framework uses Extent Reports for test execution reporting.

Reports include:

- Scenario name
- Pass/Fail status
- Failure information
- Failure screenshots

---

## 9. Logging

Log4j2 is used for framework logging.

Logs are generated for important framework events such as:

- Scenario start
- Browser initialization
- Application launch
- Login actions
- Scenario completion
- Browser shutdown

---

## 10. Cross-Browser Support

The framework supports configurable browser execution.

Currently supported:

- Chrome
- Firefox

Browser selection is controlled through the configuration file.

---

## 11. Test Data

Cucumber Scenario Outline and Examples are used for parameterized test execution.

Test data includes:

- Email
- Password
- Product
- Country
- City
- Address
- Zip Code
- Phone Number

---

## 12. Execution

The project can be executed using Maven.

```bash
mvn clean test