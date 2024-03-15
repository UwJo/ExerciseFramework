package de.frameworkexe.stepdefinitions;

import de.frameworkexe.pages.ApiDemosPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scroll {

    ApiDemosPages apiDemosPage = new ApiDemosPages();
    
@When("scroll  the page until the visibility of TextClock link")
public void navigateTotextClock() {
    apiDemosPage.scrollToTextClock();
   
   }
@When("scroll back up until the visibility of Animation")
    public void navigateToAnimation(){
        apiDemosPage.scrollToAnimation();
    }

@Then("the page should be scrolled up until the visibility of Animation")
public void animation () {}
      
}
