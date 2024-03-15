package de.frameworkexe.stepdefinitions;

import de.frameworkexe.pages.SwipePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swipe {
    SwipePage swipepage = new SwipePage();
    @When("taps on Gallery")
    public void taps_on_gallery() {
        swipepage.tappingGallery();
   
    }

    @When("taps on photos")
    public void taps_on_photos() {
        swipepage.tappingOnPhotosLink();
        
    }

    @When("swipe right at two images")
    public void swipe_right_until_visibility_of_fourth_image() {
        new SwipePage().swipeFirstImageLeft();
    
    }
    
    @When("swipe two images back at the left")
    public void swipe_left_until_visibility_of_the_first_image() {
         new SwipePage().swipeFourthImageRight();

         }
      
    @Then("the first image should be in focus")
    public void the_first_image_should_be_in_focus() {
       
    }
    
}
