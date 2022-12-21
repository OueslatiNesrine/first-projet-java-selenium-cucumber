@testDoubleClickDemo
Feature: Je souhaite cliquer deux fois

  Background: 
    When Je agrandis le page navigateur

  @DoubleClickDemo
  Scenario: Je souhaite cliquer deux fois
    Given Je me connecte sur l application "https://demoqa.com/buttons"
    When Je clique sur le bouton doubleClick
    Then Je verifie le message de action doubleClick
