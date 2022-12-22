@test
Feature: Je souhaite de additionner des valeurs

Background: 
    Given Je me connecte sur l application "https://juliemr.github.io/protractor-demo/"
    When Je agrandis le page navigateur

  @testSuperCalcul
  Scenario: Je souhaite de additionner des valeurs
    When Je mets la premiere valeur "20"
    And Je mets la deuxieme valeur "20" 
    And Je tape sur bouton go
    Then Je verifie la resultat