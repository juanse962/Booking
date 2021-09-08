Feature: Automation of suscribtion

  @smoke
  Scenario: Enter the site and suscribe for more information.
    Given the user wishes to create an account on the website
    When the user enters the email address "juansegomez40@gmail.com"
    Then User displays text on the screen