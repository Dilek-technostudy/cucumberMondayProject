Feature: Creating Position Salary
  Scenario:Position  Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on human resources on top
    And Click on setup
    And Click on position salary
    And Click on plus icon
    And Type in new position salary "PositionD"
    When Click on save button
    Then "PositionD" should be displayed
    Then Remove the data "PositionD"
    Then Verify data is removed "PositionD"


