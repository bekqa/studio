package com.veevacrmqa.studio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest{
    @Test
    public void shouldLogin() {
        driver.navigate().to("https://studio-rel-app-us.veevacrmqa.com/signin");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        assertTrue(new HomePage(driver).isLoaded());
    }
}
