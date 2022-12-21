@testWebDriverCommands
Feature: Je souhaite d utiliser le commande webDriver

  Background: 
    Given Je me connecte sur l application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Je agrandis le page navigateur

  @webDriverCommands
  Scenario: Je souhaite d utiliser le commande webDriver
    When Je prends le titre de page
    And Je prends la longueur de la titre
    And Je prends la page source
    And Je prends la longueur de la page source
    Then Je verifie l url actuel
