Feature: Actions

   @popups
    Scenario: Scrolling the API demos page
        When a user tap on views link
        And scroll  the page until the visibility of TextClock link
        And scroll back up until the visibility of Animation
        Then the page should be scrolled up until the visibility of Animation 