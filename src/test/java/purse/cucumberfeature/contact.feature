Feature: Delivery access management
    Scenario Outline:
    Given I can access to the admin
    When I enter "<gender>" and "<firstname>" and "<lastname>" and "<socity>" and "<phone>" and "<title>" and "<message>"
    And I click on send button
    Then I see the message
    Examples:
     |gender|firstname|lastname|socity|phone|title| message |
     | Homme | Mouhamed | Sane | Agiltoo | 330210202020| testeur | Hello world |