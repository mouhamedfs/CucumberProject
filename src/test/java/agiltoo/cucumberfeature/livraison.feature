@DeliverySide
Feature: Delivery access management
   @LivraisonCredentials
    Scenario Outline:
    Given I can access to the admin
    When I enter login as "<login>" and password as "<password>"
    And I can be successfully to the admin page dashboard
    When i click on Livraison on the admin menu
    And i click on Transporteurs side
    Then i should access to the livraisons admin page
    Examples:
     |login|password|
     |dsall@agiltoo.fr|@giltoo_@cademy_2023|