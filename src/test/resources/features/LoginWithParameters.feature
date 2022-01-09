@smoke
Feature: Login with parameters
  @libPar
  Scenario: Login as librarian 60
    Given I am on the login page
    When I enter username "librarian60@library"
    And I enter password 'OoNKtPqP'
    And click the sign in button
    And there should be 7355 users
    Then dashboard should be displayed
#number can be whatever you have there

  @StudPar
  Scenario: Login as student 24
    Given I am on the login page
    When I enter username "student24@library"
    And I enter password 'ya2nTtvY'
    And click the sign in button
    Then books should be displayed
#number can be whatever you have there