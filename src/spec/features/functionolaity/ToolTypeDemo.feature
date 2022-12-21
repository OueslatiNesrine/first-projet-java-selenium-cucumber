@testToolTypeDemo
Feature: Je souhaite de verifier toolTips
  Background: 
    Given Je me connecte sur l application "https://demoqa.com/tool-tips/"
    When Je agrandis le page navigateur
  @ToolTypeDemo
  Scenario: Je souhaite de verifier toolTips
    Then Je verifie affichage toolTip