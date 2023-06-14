# Techforing_Career_Site_Automation_By_Java_Selenium
### This is a complete project where an e-commerce site [Techforing](https://career.techforing.com/) is automated by writing test suites using selenium-webdriver and TestNg as testing framework.
**Two modules/page is automated:**
- **Signup** </br>
- **Signin** </br>

**20 test cases are automated.**

**For failed test cases it will take a screenshot aswell at the point of failure.** </br>

**The test runner code can be extracted from this:**
[TestRunner](https://github.com/MD-Mahedi-Hasan/Techforing_Career_Site_Automation_By_Java_Selenium/tree/main/src/test/java/testrunner)</br>
**The test cases are written following standard test case format in this excel file:**
[Test cases](https://github.com/MD-Mahedi-Hasan/Techforing_Career_Site_Automation_By_Java_Selenium/files/11725672/TechForing.xlsx) </br>

### Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij IDEA
- Build tool: Gradle
- Language: Java
- Testing Framework : TestNG

### Prerequisite: </br>
- Need to install jdk 11, gradle and allure
- Configure Environment variable for jdk 11, gradle and allure
- Clone this project and unzip it
- Open the project folder
- Double click on "build.gradle" and open it through IntellIJ IDEA
- Let the project build successfully
- Click on "Terminal" and run the automation scripts

### Run the Automation Script by the following command:
 ```
 gradle clean test 
 ```
- Selenium will open the browser and start automating.
- After automation to view allure report , give the following commands:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```
 **Below is my overall report:** </br>

![Capture](https://github.com/MD-Mahedi-Hasan/Techforing_Career_Site_Automation_By_Java_Selenium/assets/94475321/a08e6884-c8fc-48ac-813e-964468a1cc2e)  </br>

![allure 1](https://github.com/MD-Mahedi-Hasan/Techforing_Career_Site_Automation_By_Java_Selenium/assets/94475321/9a5336f9-e356-4f21-b640-d6a4801f3f03)  </br>

![Allure 2](https://github.com/MD-Mahedi-Hasan/Techforing_Career_Site_Automation_By_Java_Selenium/assets/94475321/44259d98-2866-4b4a-84fa-d9061127d806) </br>

![Allure 3](https://github.com/MD-Mahedi-Hasan/Techforing_Career_Site_Automation_By_Java_Selenium/assets/94475321/8cfca6dc-c4c0-4ea0-a136-f41d3e989112) </br>
- ## **Here is the overall walkthrough of the project:** [Project_Video](https://drive.google.com/file/d/1L4GrJ5Rp2ChR2GqMKPIchoX0lLy47OWu/view?usp=sharing) </br>
