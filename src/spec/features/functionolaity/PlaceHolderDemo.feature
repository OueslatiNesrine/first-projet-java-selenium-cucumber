@testPlaceHolderDemo
Feature: Je souhaite de verifier l affichage du text par defaut 
  
  Background: 
    Given Je me connecte sur l application "https://demoqa.com/tool-tips/"
    When Je agrandis le page navigateur

  @placeHolderDemo
  Scenario: Je souhaite de verifier l affichage du text par defaut
    Then je verifie le text place holder