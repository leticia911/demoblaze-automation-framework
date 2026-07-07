package pages;

import actions.UIActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    protected UIActions actions;

    public BasePage(WebDriver driver) {

        this.driver = driver;

        actions = new UIActions(driver);

    }

    protected void click(By locator) {

        actions.click(locator);

    }

    protected void type(By locator, String text) {

        actions.type(locator, text);

    }

    protected String getText(By locator) {

        return actions.getText(locator);

    }

    protected boolean isDisplayed(By locator) {

        return actions.isDisplayed(locator);

    }

}