Feature: Actions

   
    Scenario: Long Click action
        When a user tap on views link
        And the user tap on Drag and Drop link
        And the user drag and drops the circle with no text
        Then the message "Dropped!" should be displayed
