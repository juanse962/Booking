Feature: Automation of Log in page

  @smoke
  Scenario: login credentials to access the application
    Given the user wishes to create an account on the website
    When The user logs in with a "juansegomez40@gmail.com" and "1234Abcdef".
    Then User visualizes successful login