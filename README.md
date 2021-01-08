# Automation Task
 
I have completed the task using following:

I have used IntelliJ IDE for creating this project. Language Used = Java - with Selenium-WebDriver Browser Used = Google Chrome Maven - 'Pom.xml' file-> that has all the dependencies & configurations related/used in the project.

Test Framework used = TestNG -->Created a TestNG.xml file -> that has the TestSuite Name & the test classes that need to be excuted, in order to run test, we need to right click on TestNG.xml & select 'Run as TestNG.xml.

Implemented POM as a design pattern, by creating different classes for each pages locators & their action methods[as required in task], Created a 'base' Package with a testbase class, created a 'test' package for the test classes for the corresponding page classes & applied Assertions in that test classes.

In Latest Assessment Version: As suggested also implemented the Singleton Design Pattern to initialize the Selenium Webdriver object.

After the suite is executed, the status along with the number of test cases passed will be displayed in the RUN tab at the bottom of the IDE.

Also an Allure Report will be generated after the execution of the test for the executed test Suite, with number of test cases executed vs No. of test cases Passed.

Test Suite is marked as defualt in the Maven Surefire Plugin.

Also we can see the allure report generated for the executed testcases in the "test-output" folder in the solution explorer using following steps:- a) expand "test-output" folder b) Right click on 'index.html' c) select 'Open In Browser' -> Chrome.

To run test using CMD: Move to "Terminal" tab on the bottom of IDE and follow below steps: 

1- Type command : mvn clean -> Maven project build will be loaded.

2- Type command: mvn test --> test results will be displayed. 
