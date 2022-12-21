@testVerifyColor
Feature: Je souhaite verifier la couleur de notre application

  Background: 
    Given Je me connecte sur l application "https://www.facebook.com/"
    When Je agrandis le page navigateur

  @verifyColor
  Scenario: Je souhaite verifier la colour de notre application
    When je traite la couleur du mot de passe
    Then Je verifie la couleur