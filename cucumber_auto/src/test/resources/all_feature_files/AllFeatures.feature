Feature: Register Feature
As a user you need to open an account in ecoders website
  
  Scenario: validate the registration process
    Given The user has to be in register page 
    When the user enters a new username in username text field
    And the user enters a new password in password text field
    And the user clicks on register button
    Then the user should be navigated to the login page of ecoders website
    
    
    
    Scenario: validate the valid login process
    Given The user has to be in login page 
    When the user enters a valid username in username text field
    And the user enters a valid password in password text field
    And the user clicks on sign in button
    Then the user should be navigated to the Dashbord page of ecoders website
    
    
    
    Scenario: validate the invalid login process
    Given The user has to be in login page 
    When the user enters a invalid username in username text field
    And the user enters a invalid password in password text field
    And the user clicks on sign in button
    Then the user should not be navigated to the Dashbord page of ecoders website