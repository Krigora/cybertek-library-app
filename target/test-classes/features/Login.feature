Feature: Login
  As I user, I should be able to login
@lib
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed
@stud
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a student
    Then books should be displayed