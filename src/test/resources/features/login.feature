Feature: Login to the SauceDemo page
  As a user of the platform
  I want to authenticate
  To make a purchase

  Scenario: Successful Login with Valid Credentials
    When 'Diego' enter the username 'standard_user' and password 'secret_sauce'
    Then should see the title of 'Products'

  Scenario Outline: Login with invalid credentials
    When 'Diego' enter the username '<user>' and password '<password>'
    Then should see the error message
    Examples:
      | user           | password      |
      | standard_user  | secret_sauce1 |
      | standard_user1 | secret_sauce  |