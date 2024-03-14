Feature: Pop up

   @popups
    Scenario: Pop up functionality
        When a user tap on views link
        And scroll up the page 
        And click on Pop up menu link 
        And click on Make a Popup button 
        Then a popup menu should be displayed with link "Search"

