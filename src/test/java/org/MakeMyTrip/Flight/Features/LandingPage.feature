Feature: Check Landing page details of make my trip

  Scenario: To check landing page ad is displayed
    Given user navigates to "https://www.makemytrip.com/"
    When the landing page ad is displayed
    Then flight icon should get displayed

