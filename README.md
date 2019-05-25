***This is Cucumber + TestNG based BDD automation framework which follows Page Object Model pattern.**
All test codes/features/resources reside in src/test package.  

Cucumber feature files are in src/test/resources/features folder. Each feature file/scenario 
is tagged with Cucumber ***@tag**. If you want to run a certain @tag, you just need to mention the tag 
in MainRunner class which is src/test/java/runners.

The step definitions (implementations) for Cucumber steps are in src/test/java/step_definitions folder.
***utilities** folder contains java classess with util methods, which are reusable.

***pages** folder contains java classes, each single java class is equal to one WebPage.
For example HomePage class contains webelements and methods from Amazons HomePage
PageObject is generic class which will initialize all Pages.

Configurations are stored in configurations.properties file.
Reports can be found in targer/cucumber-report folder. Open index.html in any browser.

======= UI =======
Selenium Webdriver testing goes to amazon home page, searches for some items, and selects most expensive 
of given results, then goes to Amazon Sell page (basically just random actions to qualify for below requirements)

======= API ======
RestAssured API testing includes the test, where we search for user in github search
and verify this user exists, and if the users repos exist.




***Prerequisites, you need to have following in your laptop**
1. java 8
2. Chrome or Firefox browser
3. chromedriver http://chromedriver.chromium.org/downloads


Steps to run test:

1. go to src/test/java/runners/MainRunner
2. change tag either to @testUI or @testAPI
    if you wnat to run both, do =====>  tags = "@testAPI, @testUI", 

I've created only one scenario due to my tight schedule, but I made sure this scenario 
covers whatever requirements you asked for. 

" Code Challenge: UI Automation Testing 
Sample automation code written in Java with Selenium WebDriver that can: 
1.	Select item from pulldown menu 
2.	Input text into a textbox
3.	Click button
4.	Click page link
5.	Select value from a table
 We are looking for your use of CSS and XPath, use of POM design pattern, and general code structure and object-oriented design patterns. "


Code Challenge: REST API Testing 
Sample automation code written in Java with RestAssured that: 
1.	Sets request header
2.	Gets result body
3.	Checks return status 
4.	Checks result body
5.	Performs schema verification

We are looking for your use methods to fill request, check status, check results, verify schema. 








