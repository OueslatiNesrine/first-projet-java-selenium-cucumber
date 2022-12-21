@testDragAndDrop
Feature: Je souhaite mettre Drag dans drop

  Background: 
    Given Je me connecte sur l application "https://demoqa.com/droppable/"
    When Je agrandis le page navigateur

  @dragAndDrop
  Scenario: Je souhaite mettre Drag dans drop
    When Je mets Drag dans drop
    Then Je verifie le test changer a dropped