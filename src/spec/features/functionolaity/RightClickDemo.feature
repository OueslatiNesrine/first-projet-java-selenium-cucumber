@testRightClick
Feature: Je souhaite cliquer droite

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/buttons"
    When Je agrandis le page navigateur

  @rightClick
  Scenario: Je souhaite cliquer droite
    When Je clique droite
    Then Je verifie le message de action rightClick
