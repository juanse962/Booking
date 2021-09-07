Feature: Automation of web Travel stay

  @smoke
  Scenario Outline: the traveler is looking for a travel sta
    Given the user wishes to create an account on the website
    When the users are searching for places in <stays>
    Then The user visualizes <stays> in search
    Examples:
      | stays          |
      | "Medellín"     |
      | "Buenos Aires" |