Feature: Swipe

  @popups
  Scenario: Swiping left and right the photos in the gallery
    When a user tap on views link
    And taps on Gallery
    And taps on photos
    And swipe right at two images
    And swipe two images back at the left
    Then the first image should be in focus
