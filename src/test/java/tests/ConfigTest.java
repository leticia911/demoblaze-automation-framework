package tests;

import config.ConfigReader;
import org.testng.annotations.Test;

public class ConfigTest {

    @Test
    public void verifyConfigurationLoaded() {

        System.out.println("================================");
        System.out.println("CONFIGURACIÓN DEL FRAMEWORK");
        System.out.println("================================");

        System.out.println("Base URL       : " +
                ConfigReader.getBaseUrl());

        System.out.println("Browser        : " +
                ConfigReader.getBrowser());

        System.out.println("Headless       : " +
                ConfigReader.isHeadless());

        System.out.println("Implicit Wait  : " +
                ConfigReader.getImplicitWait());

        System.out.println("Explicit Wait  : " +
                ConfigReader.getExplicitWait());

        System.out.println("================================");
    }
}