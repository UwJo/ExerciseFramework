package de.frameworkexe.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import de.frameworkexe.stepdefinitions.DragAndDrop;
import io.appium.java_client.AppiumBy;

public class ApiDemosPages extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropBy = AppiumBy.accessibilityId("Drag and Drop");
    public DragAndDropPage tappingDragAndDropLink(){
        getElement(dragAndDropBy).click();
        return new DragAndDropPage();
 
    }

    public ApiDemosPages navigateToViews() {
        getElement(viewsLinkBy).click();
        return this;
    }
  
}
