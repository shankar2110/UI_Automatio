# java-cucumber-BDD-sample-project

A sample project for Cucumber and Selenium tests.

# Instructions

Clone the repo:

Git:
```
$ git clone git@github.com:shankar2110/UI_Automation.git
```
## Prerequisite
Maven
Git

## Use Maven

Open a command window and run:

    mvn clean verify

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `TestRunner`
class tells JUnit to kick off Cucumber.

Cucumber reports are generated inside the cucumber-html-reports present inside the target folder (masterthought report)

## Browser is set from the property file. Currently we can run in both chrome and firefox.

## Purposely added one failure test scenario in 'BCCHome.feature' to show that screenshot is getting attach to the Report when scenario fails. 

## Logs to be added yet.


