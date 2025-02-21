Feature: Check Landing page details of make my trip

  @Regression
  Scenario: To check when landing page ad is closed flight icon is displayed
    Given user is at landing page "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
    When the landing page ad is closed
    Then flight icon should get displayed

  @Regression
  Scenario: To check landing page mobile number fields are displayed
    Given user is at landing page "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
    When the landing page ad is displayed
    Then mobile number fields are displayed "Enter Mobile Number"

  @Regression
  Scenario: To check landing page personal account login displayed
    Given user is at landing page "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
    When the landing page ad is displayed
    Then personal account login is "active"

  @Regression
  Scenario: To check landing page My Biz account section displayed
    Given user is at landing page "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
    When the landing page ad is displayed
    Then mybiz account login is "inactive"

  @Regression
  Scenario: To check google Login displayed
    Given user is at landing page "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
    When the landing page ad is displayed
    Then google login is displayed