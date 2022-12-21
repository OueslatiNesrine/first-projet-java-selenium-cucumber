@testMultiSelect
Feature: Je souhaite de selectionner selon multi-select

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/select-menu"
    When Je agrandis le page navigateur

  @multiSelect
  Scenario Outline: Je souhaite de selectionner selon multi-select
    When Je prends la liste de l application
    And Je selectionne l element selon <index>
    And Je selectionne l elemnet selon "<valeur>"
    And Je selectionne l element selon "<visibleText>"
    And Je supprime l element selon <index>
    And Je supprime l element  "<Byvalue>"
    And Je supprime l element  "<ByvisibleText>"
    Then Je verifie toutes les selections

    Examples: 
      | index | valeur | visibleText |
      |     2 | opel   | Opel        |
      |     3 | audi   | Audi        |
