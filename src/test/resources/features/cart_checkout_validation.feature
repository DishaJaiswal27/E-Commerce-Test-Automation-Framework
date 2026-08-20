Feature: Cart and Checkout Validation

  Scenario Outline: User can update product quantity and proceed to checkout

    Given user is on the Demo Web Shop login page
    When user logs in with "<email>" and "<password>"
    Then user should be logged in successfully
    When user searches for product "<product>"
    And user adds the product to cart
    When user opens the shopping cart
    Then shopping cart should display the product
    When user updates the cart
    Then shopping cart should display the product
    When user proceeds to checkout
    Then checkout page should be displayed

    Examples:
      | email              | password           | product |
      | Demon123@gmail.com | Demon123@gmail.com | Laptop  |


  Scenario Outline: User can remove product from shopping cart

    Given user is on the Demo Web Shop login page
    When user logs in with "<email>" and "<password>"
    Then user should be logged in successfully
    When user searches for product "<product>"
    And user adds the product to cart
    When user opens the shopping cart
    Then shopping cart should display the product
    When user removes the product from the cart
    Then product should be removed from the shopping cart

    Examples:
      | email              | password           | product |
      | Demon123@gmail.com | Demon123@gmail.com | Laptop  |