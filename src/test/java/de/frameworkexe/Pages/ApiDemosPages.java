package de.frameworkexe.pages;

import org.openqa.selenium.By;

import de.frameworkexe.stepdefinitions.DragAndDrop;
import io.appium.java_client.AppiumBy;

public class ApiDemosPages extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropBy = AppiumBy.accessibilityId("Drag and Drop");
    By PopUpMenuBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Popup Menu\"]");
    By WebView3By = AppiumBy.accessibilityId("WebView3");
    By AnimationBy = AppiumBy.accessibilityId("Animation");
    public DragAndDropPage tappingDragAndDropLink() {
        getElement(dragAndDropBy).click();
        return new DragAndDropPage();

    }

    public ApiDemosPages navigateToViews() {
        getElement(viewsLinkBy).click();
        return this;
    }

    public void scrollToPopupMenu() throws InterruptedException {
        scrollUntilVisibilityOf("Popup Menu");

    }
    public PopUpMenuPage navigateToPopupMenu() {
        getElement(PopUpMenuBy).click();
        return new PopUpMenuPage();
    }

    public void scrollToTextClock() {
        scrollUntilVisibilityOf("TextClock");
    }

    public void scrollToAnimation() {
        scrollUntilVisibilityOf("Animation");

    }
   public void swipeDown (){
   swipe(WebView3By, "up");
   }

   public void swipeUp(){
   swipe(AnimationBy, "down");
   }

}
