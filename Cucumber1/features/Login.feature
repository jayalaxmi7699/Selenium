@login
Feature: Login Feature
@validLogin
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters a valid <username> and <password>
    And clicks on the login button
    Then the user should be redirected to the homepage
    

    Examples: 
      | username  | password | 
      | Testmanual@gmail.com | Test@123 | 
