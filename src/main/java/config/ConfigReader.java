package config;

import logging.LoggerManager;
import org.apache.logging.log4j.Logger;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Logger logger =
            LoggerManager.getLogger(ConfigReader.class);

    private static final Properties properties =
            new Properties();

    static {

        try {

            String environment =
                    System.getProperty("env", "qa");

            String fileName =
                    environment + ".properties";

            logger.info("Ambiente seleccionado: {}", environment);

            InputStream input =
                    ConfigReader.class
                            .getClassLoader()
                            .getResourceAsStream(fileName);

            if (input == null) {

                throw new RuntimeException(
                        "No se encontró el archivo: " + fileName);

            }

            properties.load(input);

            logger.info("Configuración cargada desde {}", fileName);
            logger.info("Base URL: {}", properties.getProperty("base.url"));
            logger.info("Browser: {}", properties.getProperty("browser"));

        }

        catch (Exception e) {

            throw new RuntimeException(
                    "Error cargando configuración",
                    e);

        }

    }

    private ConfigReader() {
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);

    }

    public static String getBaseUrl() {

        return getProperty("base.url");

    }

    public static String getBrowser() {

        return getProperty("browser");

    }

    public static boolean isHeadless() {

        return Boolean.parseBoolean(
                getProperty("headless"));

    }

    public static int getImplicitWait() {

        return Integer.parseInt(
                getProperty("implicit.wait"));

    }

    public static int getExplicitWait() {

        return Integer.parseInt(
                getProperty("explicit.wait"));

    }

}