Feature: Add to cart

  Scenario: Create a signup until order is confirmed
    Given user open browser
    When user open url as "http://m.happyfresh.id"
    And user add snacks product from categories
    And user add product from best deals
    Then user search for a "chocolate" and add it
    And user click on add to cart button
    And user click on checkout
    Then user click on register here
    And user enter registration details
    Then user click on register
