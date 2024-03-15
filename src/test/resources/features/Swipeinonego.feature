Feature: Swipe
@popups
Scenario:Swiping the page from top to down in one go and the reverse way 

 When a user tap on views link 
 And swipe down the page until the last link
 And swipe back up to the first link on the page 
 Then the user should go back at the top of the page 