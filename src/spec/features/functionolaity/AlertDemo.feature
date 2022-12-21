@testAlert
Feature: Je souhaite accepter une alerte


  @alert
  Scenario: Je souhaite accepter une alerte
    Given Je me connecte sur l application
    When Je agrandis le page navigateur
    And Je clique sur le bouton alert bouton
    And Je accepte l alert 
    Then Je verifie le titre de la page
    And Je ferme le navigateur
