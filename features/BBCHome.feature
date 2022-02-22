#Author: Shankar Moorthy
Feature: BBC Home Page Scenarios

  Scenario: Verify Home Page Top Links using HTTP Client
    Given I am on BCC Home Page
    Then Verify Top Links in Home Page are not broken

  Scenario: Verify the day and date in the Home page
    Given I am on BCC Home Page
    Then Verify the day and date

  Scenario: Verify Search Results
    Given I am on BCC Home Page
    When Search for 'Houghton Mifflin Harcourt'
    Then Verify the Search Results
