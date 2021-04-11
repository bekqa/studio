package com.veevacrmqa.studio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private By usernameLocator = By.id("username-input");
    private By passwordLocator = By.id("password-input");
    private By loginButtonLocator = By.xpath("//button[normalize-space()='Sign In']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getUsernameField() {
        return driver.findElement(usernameLocator);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordLocator);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButtonLocator);
    }

    public void login() {
        getUsernameField().sendKeys("vadmin@veeva.qa.bek.studiorel");
        getPasswordField().sendKeys("phar1234");
        getLoginButton().click();
    }
}
