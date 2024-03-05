package de.frameworkexe.stepdefinitions;

import de.frameworkexe.pages.ApiDemosPages;
import de.frameworkexe.pages.DragAndDropPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDrop {

    ApiDemosPages apiDemosPage = new ApiDemosPages();
    DragAndDropPage dragAndDropPage;
    @When("a user tap on views link")
    public void a_user_tap_on_views_link() {
        apiDemosPage.navigateToViews();
    }

    @When("the user tap on Drag and Drop link")
    public void the_user_tap_on_drag_and_drop_link() {
    dragAndDropPage = apiDemosPage.tappingDragAndDropLink();
    
    }

    @When("the user drag and drops the circle with no text")
    public void the_user_long_clicks_on_the_textless_circle() {
        dragAndDropPage.dragAndDropCircleWithNoText();
    }

    @Then("the message {string} should be displayed")
    public void the_message_should_be_displayed(String string) {
        dragAndDropPage.checkingSimilarityOfText(string);
    
    }
}
    

