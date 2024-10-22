Feature: Launch the browser and navigate to the URL

  Scenario: Launch the browser and navigate to the URL
    Given I open the browser
    When I navigate to the "https://www.google.com"
    Then I close the browser