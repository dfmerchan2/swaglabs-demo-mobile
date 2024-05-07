Feature: Buy products on the SauceDemo page
  As a user of the platform
  I want to select different products
  To make the purchase

  Background:
    Given 'Diego' enter the username 'standard_user' and password 'secret_sauce'

  Scenario: Add Products to Cart and Checkout Successfully
    Given add the following products to the cart
      | Sauce Labs Bike Light    |
      | Sauce Labs Fleece Jacket |
    When see the products added to the shopping cart
    And you enter personal information
    Then look at the invoice to finalize the order