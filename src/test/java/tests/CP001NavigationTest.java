package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import reporting.ReportManager;
import retry.RetryAnalyzer;
import utils.AssertionManager;

public class CP001NavigationTest extends BaseTest {

    /**
     * Historia Jira:
     * DA-5
     *
     * Caso de Prueba:
     * CP-001
     *
     * Objetivo:
     * Verificar que el usuario pueda regresar al Home
     * haciendo clic sobre el logo de DemoBlaze.
     */
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void shouldReturnToHomeWhenClickingLogo() {

        HomePage homePage =
                new HomePage(driver);

        ProductPage productPage =
                new ProductPage(driver);

        ReportManager.info(
                "Seleccionando el primer producto disponible.");

        productPage.openFirstProduct();

        ReportManager.pass(
                "Detalle del producto abierto correctamente.");

        AssertionManager.assertFalse(
                homePage.isHomePage(),
                "El usuario se encuentra en la página de detalle del producto."
        );

        ReportManager.info(
                "Regresando al Home mediante el logo.");

        homePage.clickLogo();

        AssertionManager.assertTrue(
                homePage.isHomePage(),
                "El usuario regresó correctamente al Home."
        );

        ReportManager.pass(
                "Navegación al Home verificada correctamente.");

    }

}