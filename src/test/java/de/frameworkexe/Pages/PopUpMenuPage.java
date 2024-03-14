package de.frameworkexe.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PopUpMenuPage extends BasePage {
    By linkMessageBy = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    By MakeAPopUpMenuBy = AppiumBy.accessibilityId("Make a Popup!");

    public PopUpMenuPage makeAPopUpMenu() {
        getElement(MakeAPopUpMenuBy).click();
        return this;

    }

    public void verify_the_visibility_of_search(String expectedMessage) {
        String linkmessage = getElement(linkMessageBy).getText();
        String expectedMessagelink = "Search";
        checkingSimilarityOfText(expectedMessagelink, linkmessage);

    }
}
