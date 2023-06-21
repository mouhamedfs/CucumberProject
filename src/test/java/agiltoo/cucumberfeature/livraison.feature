@DeliverySide
Feature: Delivery access management

  @LoginCredentials
  Scenario Outline:
    Given I can access to the admin page connexion
    When I enter login as "<login>" and password as "<password>"
    Then I can be successfully to the admin page dashboard
    Examples:
      |login|password|
      |dsall@agiltoo.fr|@giltoo_@cademy_2023|

   @LivraisonCredentials
    Scenario:
      Given i can access on the admin page
      And i click on Livraison on the admin menu
      And i click on Transporteurs side
      Then i should access to the livraisons admin page
