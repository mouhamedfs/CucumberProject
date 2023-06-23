@AdminSide

Feature: Admin authentication

  @LoginCredentials
  Scenario Outline:
    Given I can access to the admin page connexion
    When I enter login as "<login>" and password as "<password>"
    Then I can be successfully to the admin page dashboard
    Examples:
      |login|password|
      |dsall@agiltoo.fr|@giltoo_@cademy_2023|