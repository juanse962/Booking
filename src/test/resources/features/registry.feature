Feature: Automation of web Travel stay

  @smoke
  Scenario Outline: Enter the website and fill in the form
    Given the user wishes to create an account on the website
    When The user enters his credentials
      | user    | pass       |
      | <email> | <password> |
    Then The user is successfully registered
    Examples:
      | email  | password   |
      | juan   | 1234Abcdef |
      | camilo | 1234Abcdef |
      | pedro  | 1234Abcdef |