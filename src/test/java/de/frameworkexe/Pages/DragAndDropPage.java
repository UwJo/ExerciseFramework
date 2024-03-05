package de.frameworkexe.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DragAndDropPage extends BasePage {
    By textLessCircleDragabbleBy = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View[1]");

    By dragResultContainerBy = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]");
    
public DragAndDropPage dragAndDropCircleWithNoText() {
    dragAndDropAction(textLessCircleDragabbleBy,659,1080);
    return this;

}
public void checkingSimilarityOfText(String expectedMessage){
    String dragResultMessage = getElement(dragResultContainerBy).getText();
        checkingSimilarityOfText(expectedMessage, dragResultMessage);
        
}
  
}
