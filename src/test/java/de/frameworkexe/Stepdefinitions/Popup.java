package de.frameworkexe.stepdefinitions;

import de.frameworkexe.pages.ApiDemosPages;
import de.frameworkexe.pages.PopUpMenuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Popup {
  ApiDemosPages apiDemosPage = new ApiDemosPages();
  PopUpMenuPage popUpMenuPage;
  @When("scroll up the page")
  public void scroll_up_the_page() throws InterruptedException {
    apiDemosPage.scrollToPopupMenu();
  }
  @When ("click on Pop up menu link")
  public void popUpMenuPage(){

    popUpMenuPage=apiDemosPage.navigateToPopupMenu();

  }
  @When("click on Make a Popup button")
  public void click_on_make_a_popup_button() {
    popUpMenuPage.makeAPopUpMenu();
  }

  @Then("a popup menu should be displayed with link {string}")
  public void a_popup_menu_should_be_displayed(String string) {
    
   
  }

}

