Feature: ConsultUser

  @ConsultListUser
  Scenario: Consult list user succesfull
    Given I want consult user list of information to service "https://reqres.in/api/users"
    When I execute service request
    Then I validate the code status will "200"
