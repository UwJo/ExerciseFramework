package de.frameworkexe.stepdefinitions;

import de.frameworkexe.pages.ApiDemosPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwipeUpAndDown {
  ApiDemosPages apiDemosPages = new ApiDemosPages();

  @When("swipe down the page until the last link")
  public void swipe_down_the_page_until_the_last_link() {
    apiDemosPages.swipeDown();
  }
  @When("swipe back up to the first link on the page")
  public void swipe_back_up_to_the_first_link_on_the_page() {
  apiDemosPages.swipeUp();
  }
  @Then("the user should go back at the top of the page")
  public void the_user_should_go_back_at_the_top_of_the_page() {

  }

}
