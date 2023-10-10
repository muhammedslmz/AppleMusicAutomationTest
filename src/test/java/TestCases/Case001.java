package TestCases;

import Drivers.BaseTest;
import Pages.LoginPage;
import org.apache.commons.logging.Log;
import org.testng.annotations.Test;

public class Case001 extends BaseTest {




    @Test
    public void appleMusicLoginTest(){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login();

    }
}
