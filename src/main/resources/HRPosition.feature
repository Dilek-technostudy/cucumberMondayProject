Feature: Creating Positions

  Scenario Outline: Positions creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on human resources on top
    And Click on setup
    And Click on positions
    And Click on plus icon
    And Type in new positions names "<position1>"
    And Type in shortnames"<ps1>"
    When Click on save button
    Then "<position1>" should be displayed
    And Remove the data "<position1>"
    Then Verify data is removed "<position1>"
    Examples:
      | position1 | ps1 |
      |name1      | ps2 |




