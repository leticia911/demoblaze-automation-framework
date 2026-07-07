package tests;

import driver.BrowserManager;
import org.testng.annotations.Test;

public class BrowserManagerTest {

    @Test
    public void verifyBrowserConfiguration(){

        System.out.println(
                BrowserManager.getBrowser());

    }

}