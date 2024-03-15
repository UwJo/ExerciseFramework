package de.frameworkexe.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwipePage extends BasePage {
    By GalleryBy = AppiumBy.accessibilityId("Gallery");
    By PhotosBy = AppiumBy.accessibilityId("1. Photos");
    By firstImageBy = AppiumBy.xpath(("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]\r\n" + //
 ""));
    By fourthImageBy = AppiumBy.xpath(("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[3]"));
    public SwipePage tappingGallery() {
        getElement(GalleryBy).click();
        return new SwipePage();
    }
    
    public SwipePage tappingOnPhotosLink(){
        getElement(PhotosBy).click();
        return new SwipePage();
    }
    public void swipeFirstImageLeft() {
        swipe(firstImageBy, "left");

    }
    
    public void swipeFourthImageRight(){
        swipe(fourthImageBy, "right");
    }
}
