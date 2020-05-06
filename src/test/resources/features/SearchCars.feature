@SearchCar
Feature: Validate Search car page


  Scenario:
    Given we are on the home page"https://www.carsguide.com.au/"
    When I move to Buy+Sell Menu
      | Menu       |
      | buy + sell |
      | reviews    |
      | news       |
    And click on "Search Cars" link
    And Select car make as "BMW" from Any Make dropdown
    And Select car model as "1 Series" from Any Model dropdown
    And Select car location as "ACT - All" from Any Location dropdown
    And Select car price as "$10,000" from Any Price (max) dropdown
    And click on Find My Next Car button
    Then I see list of searched cars
    And the page title is "Bmw 1 Series Under 10000 for Sale ACT | carsguide"