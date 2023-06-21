@DeliverySide
Feature: Delivery access management

   @LivraisonCredentials
    Scenario Outline:
     Given I can access to the admin page connexion
     When I enter login as "<login>" and password as "<password>"
     And i can access on the admin page
     And i click on Livraison on the admin menu
     And i click on Transporteurs side
     Then i should access to the livraisons admin page
     Examples:
       |login|password|
       |dsall@agiltoo.fr|@giltoo_@cademy_2023|


