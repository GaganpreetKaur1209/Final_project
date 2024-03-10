# Finding the interest amount for current year 

[github link](https://github.com/GaganpreetKaur1209/Final_project.git)

## Problem Statement : Find the Interest Amount for current year
 
### Detailed Description: Hackath Ideas
 
1. Find the EMI for Car with price of 15 Lac, Interest rate of 9.5% & Tenure 1 year; Display the interest amount & principal amount for one month

2. From Menu, pick Home Loan EMI Calculator, fill relevant details & extract all the data from  year on year table & store in excel;

3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; change the Loan tenure for year & month,check the change in scale; Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator.
 
 
### Key Automation Scope

* Validation of transactions & do calculations;

* Extract table values & store in excel

* Filling data in screen & multiple UI validations

* Navigation from Menus

* Reusable methods

* Scrolling down in web page

### Data source:
https://emicalculator.net/
 
### Technology Used

* Java(maven Project)

* Selenium 4.17.0

* TestNG 7.4.0

* Eclipse 2013-12 (4.30.0)

* ExtentReports 5.1.1

* ApachePoi 

* Cucumber

* Jenkins

* Github
 
### Folder Structure

This Project Uses Page Object Model


<img width="194" alt="Screenshot 2024-02-29 152118" src="https://github.com/GaganpreetKaur1209/Final_project/assets/141823661/9933f3b0-3ee9-4685-a78c-5313dcfbbb89">


 
### POM- Page Object Model

#### src/test/java -

* pageObjects package - contains page elements and methods for all pages in application.

* stepDefinitions package - contains stepDefination and hooks files for cucumber.

* testBase package - contains BaseClass file which have setup and teardown methods.

* testCases package - contains all the required test cases for the application.

* testRunner package - contains Testrun file for executing testcases through cucumber.

* utilities package - contains Excel and ExtentReport files for testNG.
 
#### src/test/resources -

* config.properties - contains application URl and execution environment detail.

* extent.properties - contains  ExtentReport files for Cucumber.

* log4j2.xml - contains file for generating logs.
 
#### Features folder - 

Contains feature file which have scenarios for cucumber.
* CarLoan.feature
* HomeLoan.feature
* LoanCalculator.feature
 
 
### Reporting

The framework gives report in three ways,
 
* Log - In file automation.log.

* A TestNG report - Which is generated using extent reports, under the folder Reports.

* A Cucumber report - Which is generated using extent reports, under the folder CucumberExtentReports.
 
###  Test Cases

* TC_001_CarLoan.java

* TC_002_HomeLoan.java

* TC_003_LoanCalculator.java
 
### How to run project

* Through TestNG - run the file testng.xml as TestNg suite.

* Through Cucumber - run the fie TestRun.xml as Junit Test.

* Through Jenkins -

  run the project in command prompt using following commands : java -jar jenkins.war

* Through Selenium grid -

  set environment as remote config.properties

  run the project in command prompt using following commands : java -jar (selenium-file-name) standalone

* Through cmd -

  set project path : cd/path of project 

  run the project in command prompt using following commands : mvn test
 
### Author

Gaganpreet Kaur
