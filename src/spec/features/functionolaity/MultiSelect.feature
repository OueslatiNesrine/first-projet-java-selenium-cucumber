@testMultiSelect
Feature: Je souhaite de selectionner selon multi-select

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/select-menu"
    When Je agrandis le page navigateur

  @multiSelect
  Scenario: Je souhaite de selectionner selon multi-select
    When Je prends tout la liste
    And Je select selon "<OptionSelect>"
    And Je supprime selon "<OptionDelet>"
    Then Je verifie le choix de selection
    And Je verifie le choix de suppression
