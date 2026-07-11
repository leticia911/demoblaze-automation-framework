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
     * Verificar que el usuario pueda regresar a la página principal
     * haciendo clic sobre el logo de DemoBlaze.
     */
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void shouldReturnToHomeWhenClickingLogo() {

        // Se instancia la página principal.
        HomePage homePage =
                new HomePage(driver);

        // ============================================================
        // Paso 1:
        // Abrir el primer producto disponible desde la página Home.
        // ============================================================

        ReportManager.info(
                "Seleccionando el primer producto disponible.");

        ProductPage productPage =
                homePage.openFirstProduct();

        // ============================================================
        // Verificación intermedia:
        // Confirmar que el detalle del producto cargó correctamente.
        // ============================================================

        AssertionManager.assertTrue(
                productPage.isLoaded(),
                "La página de detalle del producto se cargó correctamente.");

        // ============================================================
        // Paso 2:
        // Verificar que el usuario ya no se encuentra en el Home.
        // ============================================================

        AssertionManager.assertFalse(
                homePage.isHomePage(),
                "El usuario se encuentra en la página de detalle del producto.");

        // ============================================================
        // Paso 3:
        // Regresar al Home utilizando el logo de DemoBlaze.
        // ============================================================

        ReportManager.info(
                "Regresando al Home mediante el logo.");

        homePage.clickLogo();

        // ============================================================
        // Paso 4:
        // Verificar que el usuario regresó correctamente al Home.
        // ============================================================

        AssertionManager.assertTrue(
                homePage.isHomePage(),
                "El usuario regresó correctamente al Home.");

        // ============================================================
        // Paso 5:
        // Verificar que la lista de productos vuelva a mostrarse.
        // ============================================================

        AssertionManager.assertTrue(
                homePage.isProductListVisible(),
                "La lista de productos se encuentra visible.");

        ReportManager.pass(
                "Navegación al Home mediante el logo verificada correctamente.");

    }

}