package com.veevacrmqa.studio;

import com.saucelabs.saucebindings.SauceSession;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    private WebDriver getDriver(){
        new SauceSession().start();
    }

    public void successfullyLogin(){
        driver.navigate().to("https://studio-rel-app-us.veevacrmqa.com/signin");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        assertTrue(new HomePage(driver).isLoaded());
    }

}
