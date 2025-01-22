# OrangeHRM Automation Testing Project

## Project Overview
The **OrangeHRM Automation Testing Project** is designed to automate the functional and regression testing of the OrangeHRM application using the TestNG framework. The project is implemented in **Java** and utilizes **Maven** for build and dependency management.

---

## Repository

GitHub Repository: [OrangeHRM Automation Testing Project](https://github.com/TJ-TusharJadhav/com.orangeHRM.git)

---

## Prerequisites

To run this project, ensure that the following prerequisites are met:

1. **Java Development Kit (JDK)**
   - Version: 11 or higher

2. **Maven**
   - Version: 3.6 or higher

3. **TestNG**
   - Included in the `pom.xml` dependencies.

4. **Browser**
   - Google Chrome 

5. **WebDriver**
   - ChromeDriver

6. **Integrated Development Environment (IDE)**
   - Eclipse

---

## Project Structure

```
OrangeHRM-Automation-Testing
│
├── src
│   ├── main
│   │   
│   ├── test
│       ├── java
│       │   ├── com.orangehrm.testcases      # Test classes
│       │   ├── com.orangehrm.pageobjects   # Page Object Model classes
│       │   └── com.orangehrm.dataprovider  # Data providers for parameterized tests
│
├── test-output                             # TestNG-generated reports
├── pom.xml                                 # Maven configuration file
├── README.md                               # Project description
└── .gitignore                              # Git ignore file
```

---

## Tools and Technologies

- **Programming Language**: Java
- **Build Tool**: Maven
- **Testing Framework**: TestNG
- **Browser Automation**: Selenium WebDriver
- **Reporting**: TestNG Reports

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/TJ-TusharJadhav/com.orangeHRM.git
   
---

## Configuration

1. Update the `config.properties` file (located in `src/main/resources`):
   ```properties
   baseURL=https://opensource-demo.orangehrmlive.com
   browser=chrome
   username=Admin
   password=admin123
  

---

## Running Tests



---

## Reporting

Test reports are generated in the `test-output` folder. Open the `index.html` file in a browser to view detailed test execution results.

---

## Features Covered

1. **Login Functionality**
2. **Dashboard Verification**
3. **Employee Management**
4. **Leave Management**
5. **Payroll Processing**

---

## Contributing

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit changes:
   ```bash
   git commit -m "Description of changes"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a Pull Request.

---

## License



---

## Contact

For further details or queries, please reach out to:
- **Name**: Tushar Jadhav
- **Email**: tusharsjadhav60@gmail.com
