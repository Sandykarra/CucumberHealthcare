#Author: Sandya
#Keywords Summary : Validating the Broadband tab
#Feature: This feature validating the Broadband tab is working as expected


Feature: This feature validating the Broadband tab is working as expected  
  
  Scenario: User Navigate to the Broadband Tab
    Given User should be on the home page
    When  User navigate to Broadband Tab
    Then user should be on the "https://www.sky.com/broadband"
    When User click on the compare broadband packages
    Then User can see the "Join Now" message on the page
   


    
    

  
