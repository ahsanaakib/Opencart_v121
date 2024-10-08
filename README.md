## Opencart_v121
## Project Overview: Hybrid-Driven Automation Testing for OpenCart
This project involves the automation of key functionalities for the Opencart platform, focusing on user registration, login processes with data driven and product search. The automation framework is built using Selenium with Java, and it leverages TestNG for test management and Extent reports for reporting.

**URL:** https://tutorialsninja.com/demo/

## Key Features
* Automated UI Testing for registration, login data driven and search product.
* Test grouping with TestNG (e.g., Sanity, Regression).
* Extent Reports with failure screenshots.
* Cross-browser Compatibility Tests
* run.bat file for executing tests via Maven.
* Jenkins Integration with GitHub for automated builds.

## Planned Features
* **Checkout Process Test:** Automate the entire checkout workflow, including adding items to the cart, providing shipping details, and completing payment.
* **Account Management Tests:** Automate scenarios like updating profile information, changing passwords, and viewing order history.
  
## How to Run the Tests

### Running Tests via TestNG Suites
- **`master.xml`**: Use this suite to execute the entire test suite.
- **`grouping.xml`**: This suite allows you to run specific groups of tests, such as **Sanity**, **Regression**, etc.

### Running Tests Using `run.bat` (Windows Users)
For a convenient approach, Windows users can utilize the `run.bat` file provided in the project root. This batch script automates the process of executing the Maven tests.

## Jenkins Integration
This project is configured to work with Jenkins for continuous integration and continuous delivery. Jenkins allows you to schedule or trigger test executions automatically whenever changes are made to the repository.

## Note: **Please be aware that one test case has been intentionally designed to fail. This is to demonstrate the functionality of capturing screenshots for failed tests. The failure is not indicative of any issues with the application but rather serves as a visual example of the reporting capabilities of the testing framework.**
