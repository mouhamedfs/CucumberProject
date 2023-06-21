@PrestashopLogin
Feature: User authentication

  @LoginValidCredentials
  Scenario Outline: As a customer i can register on My store
    Given I can access to the login page
    And I click on Connexion
    When I enter a login as "<login>" and password as "<password>"
    Then I can be successfully logged in with the name of the user
    Examples:
      |login|password|
      |mfsane@agiltoo.fr|Sane1995@@|