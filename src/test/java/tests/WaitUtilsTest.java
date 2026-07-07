package tests;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.WaitUtils;

public class WaitUtilsTest extends BaseTest {

    @Test
    public void verifyWait() {

        Assert.assertNotNull(

                WaitUtils.waitForVisibility(
                        driver,
                        By.id("tbodyid"))

        );

    }

}