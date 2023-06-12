# Techforing_Career_Site_Automation_By_Java_Selenium
### This is a complete project where an career site [Techforing](https://career.techforing.com/) is automated by writing test suites using selenium-webdriver and TestNg as testing framework.
**One modules/page is automated:**
- **Search** </br>


**20 test cases are automated.**

**For failed test cases it will take a screenshot aswell at the point of failure.** </br>

**The test runner code can be extracted from this:**
[TestRunner](https://github.com/MD-Mahedi-Hasan/Techforing_Career_Site_Automation_By_Java_Selenium/tree/main/src/test/java/testrunner)</br>
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
