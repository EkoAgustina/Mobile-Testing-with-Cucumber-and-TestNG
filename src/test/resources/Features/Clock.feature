Feature: Alarm
Scenario: User can set alarm to 05.30AM
  Given Open application
  Then User click the alarm icon on the navbar
  And Click button add alarm
  And User choose 5 when select time
  And User choose 30 when select time
  And User click OK
  And User click monday to friday
