#Author: Shankar Moorthy
@HomeAll
Feature: BBC Home Page Scenarios

  @smoke
  Scenario: Verify Home Page Top Links using HTTP Client
    Given I am on BCC Home Page
    Then Verify Top Links in Home Page are not broken

  @regression
  Scenario: Verify the day and date in the Home page
    Given I am on BCC Home Page
    Then Verify the day and date

  @smoke @regression
  Scenario: Verify Search Results
    Given I am on BCC Home Page
    When Search for 'Houghton Mifflin Harcourt'
    Then Verify the Search Results
