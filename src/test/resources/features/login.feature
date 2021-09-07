Feature: Automation of web Discover Colombia

  @smoke
  Scenario: Enter the site and look for the rent a car option.
    Given the user wishes to create an account on the website
    When The user logs in with a "juansegomez40@gmail.com" and "1234Abcdef".
    Then User visualizes successful login