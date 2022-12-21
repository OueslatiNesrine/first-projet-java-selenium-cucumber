@testPractiseSwitchCommand
Feature: Je souhaite sauter frame
  
  Background: 
  Given Je me connecte sur l application "https://demo.guru99.com/test/guru99home/"
  When Je agrandis le page navigateur

  @PractiseSwitchCommand
  Scenario: Je souhaite sauter frame
    When Je saute I frame
    Then je click sur image