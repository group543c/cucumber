Feature: The cart
  Scenario: Adding toys to the cart and removing toys from the cart
    When we go to the shop
    And add toys to the cart
    Then we can remove toys from the cart