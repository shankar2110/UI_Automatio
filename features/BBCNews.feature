#Author: Shankar Moorthy
@NewsAll
Feature: BBC News Page Scenarios

  Background: Navigating to home page
    Given I am on BCC Home Page

  @smoke @regression
  Scenario Outline: Verify Page Url
    When Click on "<Pages>" link
    Then Verify the URl contains "<URL_String>"

    Examples: 
      | Pages  | URL_String |
      | News   | news       |
      | Sport  | sport      |
      | Travel | travel     |
