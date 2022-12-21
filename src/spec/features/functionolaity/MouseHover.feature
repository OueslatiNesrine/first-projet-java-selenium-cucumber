@testMouseHover
Feature: Je souhaite deplacer le curseur sur un elemnet

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/menu/"
    When Je agrandis le page navigateur

  @mouseHover
  Scenario: Je souhaite deplacer le curseur sur un elemnet
    When Je supprime les cookies
    Then je deplace sur main item2
