Feature: Check Landing page details of make my trip

  @Regression
  Scenario: To check landing page ad is displayed
    Given user is at landing page "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
    When the landing page ad is displayed
    Then flight icon should get displayed

