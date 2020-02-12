Feature: Login 

Scenario: login to the facebook website
      Given user already at the facebook login page
      When user entered username
      And user entered password
      Then user should be logged in facebook