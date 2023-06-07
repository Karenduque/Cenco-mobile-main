@Android @LogIn
Feature: LogIn
  The purpose of this feature is to cover all the possible scenarios related to the login

        Scenario Outline: 01. Login to a Conduit with user "<Email>" and password "<Password>"
            Given I am on the Home of Conduit
             When I click on the Login button
             Then I am on the Login page
              And I can fill in the user field "<Email>"
              And I can fill in the password field "<Password>"
              And I click on the Sig In button
             Then the login is successfully


        Examples:
                  | Email                | Password |
                  | prueba@accenture.com | 123456   |