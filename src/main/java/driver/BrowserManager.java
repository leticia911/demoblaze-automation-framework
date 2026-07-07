package driver;

import config.ConfigReader;

public class BrowserManager {

    public static DriverType getBrowser() {

        String browser =
                ConfigReader.getBrowser();

        return DriverType.valueOf(
                browser.toUpperCase());

    }

}