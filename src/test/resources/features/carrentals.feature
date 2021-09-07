Feature: Automation of car rentals

  @smoke
  Scenario: Enter the site and look for the rent a car option.
    Given the user wishes to create an account on the website
    When The user is looking for car rental "Medellín, Antioquia, Colombia"
    Then The user visualizes the search