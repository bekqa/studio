package com.veevacrmqa.studio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    private By signOutbutton = By.xpath("//button[normalize-space()='Sign Out']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(signOutbutton)).isDisplayed();
    }
}
