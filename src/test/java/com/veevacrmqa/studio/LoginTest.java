package com.veevacrmqa.studio;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void shouldLogin() {
        successfullyLogin();
    }
}
