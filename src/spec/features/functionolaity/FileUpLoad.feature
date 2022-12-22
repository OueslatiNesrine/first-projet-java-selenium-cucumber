@test
Feature: Je souhaite de telecharger un fichier text
 
   Background: 
    Given Je me connecte sur l application "https://demo.guru99.com/test/upload/"
    When Je agrandis le page navigateur

  @testFileUpLoad
  Scenario: Je souhaite de telecharger un fichier text
    When Je telecharge le fichier text 
    And Je tape sur le bouton submitFile 
    Then Je verifie que le ficher est telecharger