package pages;

import config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By logo =
            By.id("nava");

    public HomePage(WebDriver driver) {

        super(driver);

    }

    public void clickLogo() {

        click(logo);

    }

    public String getUrl() {

        return driver.getCurrentUrl();


    }

    public boolean isHomePage() {

        String url = driver.getCurrentUrl();

        return url.equals(ConfigReader.getBaseUrl())
                || url.endsWith("index.html");

    }
    }
