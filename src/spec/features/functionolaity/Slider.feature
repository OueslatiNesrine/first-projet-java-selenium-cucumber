@test
Feature: Je souhaite de piloter slider

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/slider/"
    When Je agrandis le page navigateur

  @testSlider
  Scenario: Je souhaite de piloter slider
    When Je transfert le slider a un autre endroit
    Then Je verifie la position de slider
