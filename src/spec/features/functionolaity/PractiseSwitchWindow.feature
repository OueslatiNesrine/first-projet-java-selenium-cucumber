@testPractiseSwitchWindow
Feature: Je souhaite de basculer entre les windows

Background: 
  Given Je me connecte sur l application "https://demoqa.com/browser-windows"
  When Je agrandis le page navigateur

  @PractiseSwitchWindow
  Scenario: Je souhaite de basculer entre les windows
    When Je prend l adress de window actuel 
    And Je tape sur le bouton new message window 
    And Je prend toutes les adresses des windows ouverts
    And Je passe par window a un autre
    Then Je affiche window actuel
