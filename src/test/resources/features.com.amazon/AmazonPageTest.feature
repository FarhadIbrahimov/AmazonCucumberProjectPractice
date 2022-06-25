Feature: Tests amazon page


  Background: Main Test Setup
   Given the user navigates to amazon web page


   @smokoe @amazon
 Scenario: Test item availability for purchase
     When user types "Alexa" in  amazon search box
     And user clicks on search Button
     And user navigates to the second page
     And user selects the 3 item
     Then user will see "Add to Cart" button and able to add it to cart

#    Then the user would be able to see added to card message
