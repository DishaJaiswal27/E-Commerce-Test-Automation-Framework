Feature: Shopping Cart

  Scenario Outline: User can add a product to shopping cart

    Given user is on the Demo Web Shop login page

    When user logs in with "<email>" and "<password>"

    When user searches for product "<product>"

    And user adds the product to cart

    When user opens the shopping cart

    Then shopping cart should display the product

    Examples:

      | email              | password           | product |
      | Demon123@gmail.com | Demon123@gmail.com | Laptop  |