package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;
import logging.LoggerManager;
import org.apache.logging.log4j.Logger;

public class ProductPage extends BasePage {
    private static final Logger logger =
            LoggerManager.getLogger(ProductPage.class);
    private final By firstProduct =
            By.cssSelector("#tbodyid .card-title a");

    public ProductPage(WebDriver driver) {

        super(driver);

    }

    public void openFirstProduct() {

        logger.info("Página actual: {}", driver.getCurrentUrl());
        logger.info("Título: {}", driver.getTitle());

        WaitUtils.waitForElements(driver, firstProduct);

        logger.info("Productos encontrados: {}",
                driver.findElements(firstProduct).size());

        click(firstProduct);

        logger.info("Detalle del producto abierto: {}",
                driver.getCurrentUrl());

    }
    }