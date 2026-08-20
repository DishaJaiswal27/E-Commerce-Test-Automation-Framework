Feature: Complete Purchase Flow

  Scenario Outline: User can complete a purchase successfully
    Given user is on the Demo Web Shop login page
    When user logs in with "<email>" and "<password>"
    Then user should be logged in successfully
    When user searches for product "<product>"
    And user adds the product to cart
    When user opens the shopping cart
    Then shopping cart should display the product
    When user proceeds to checkout
    Then checkout page should be displayed
    When user completes the checkout process with "<country>", "<city>", "<address>", "<zipCode>" and "<phoneNumber>"
    Then order confirmation should be displayed

    Examples:
      | email              | password           | product | country | city   | address          | zipCode | phoneNumber |
      | Demon123@gmail.com | Demon123@gmail.com | Laptop  | India   | Bhopal | 123 MP Nagar     | 462001  | 9876543210  |