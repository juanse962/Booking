Feature: Automation of web Discover Colombia

  @smoke
  Scenario: Explore places to visit in Colombia
    Given the user wishes to create an account on the website
    When the users are searching for places in Colombia "Cartagena de Indias"
    Then The user visualizes "Cartagena de Indias" in search