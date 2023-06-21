@Registration
Feature: User registred

  @Registred
  Scenario: Register a new user
    Given I can access to the login page on Connexion
    And i click on link to register
    When Fill in the fields of the form
    And Click on register button
    Then Redirect  to the home page