Feature: Create User
  Background: User Service
    Given application is turned on

  Scenario: Addition
    Given the following users:
      | name  | email             |
      | boss  | boss@company.com  |
    When i create users
    Then i see user in userlist