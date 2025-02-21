Feature: Check Home page details of make my trip

  @Regression
  Scenario: To check flight and oneway trip is selected by default
    Given user is at landing page "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
    When the landing page ad is closed
    And flight icon should get displayed
    Then flight and oneway trip should be selected by default

