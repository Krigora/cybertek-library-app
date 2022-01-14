@newwip @smoke
Feature: User Logs in with different usernames
  As a user, I should be able to login with different users using their correct emails and
  passwords. When I login, I should be able to see username in the account username section

  Scenario Outline: Verify user information <email>
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"
#TEST DATA
    @students
    Examples:
      | email             | password | name            |
      | student27@library | kkMksO2i | Test Student 27 |
      | student28@library | 19Ceq2sT | Test Student 28 |
      | student29@library | WyIUNpDI | Test Student 29 |
      | student21@library | GapVdtca | Test Student 21 |

    @librarians
    Examples:
      | email             | password | name            |
      | student33@library | a1aI3VDj | Test Student 33 |
      | student41@library | MhQEHwP8 | Test Student 41 |
      | student37@library | GpaUyXJQ | Test Student 37 |


