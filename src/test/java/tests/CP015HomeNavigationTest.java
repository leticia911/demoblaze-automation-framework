package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import utils.AssertionManager;

/**
 * ===============================================================
 * Historia Jira:
 * DA-5
 *
 * Caso de Uso:
 * CU-002
 *
 * Caso de Prueba:
 * CP-015
 *
 * Título:
 * Navegación al Home mediante el enlace Home.
 *
 * Objetivo:
 * Verificar que el usuario pueda regresar a la página principal
 * utilizando el enlace "Home" disponible en la barra superior
 * de navegación.
 *
 * Criterios de aceptación cubiertos:
 *
 * CA-001:
 * El enlace Home redirige correctamente a la página principal.
 *
 * CA-002:
 * La URL corresponde al Home de DemoBlaze.
 *
 * CA-003:
 * El catálogo de productos vuelve a visualizarse correctamente.
 *
 * Automatización:
 * Selenium WebDriver + Java + TestNG
 *
 * Patrón:
 * Page Object Model (POM)
 * ===============================================================
 */
public class CP015HomeNavigationTest extends BaseTest {

    @Test(description = "CP-015 - Verificar navegación al Home desde el enlace Home")
    public void verifyNavigationUsingHomeLink() {

        // Se instancia la página principal de DemoBlaze.
        HomePage homePage =
                new HomePage(driver);

        // ============================================================
        // Paso 1:
        // Abrir un producto desde la página principal.
        // Esto simula el recorrido real de un usuario que navega por
        // el sitio antes de regresar al Home.
        // ============================================================

        ProductPage productPage =
                homePage.openFirstProduct();

        // ============================================================
        // Verificación intermedia:
        // Confirmar que la página del producto cargó correctamente.
        // ============================================================

        AssertionManager.assertTrue(
                productPage.isLoaded(),
                "La página del producto se cargó correctamente.");

        // ============================================================
        // Paso 2:
        // Hacer clic en el enlace Home del menú superior.
        // ============================================================

        productPage.clickHome();

        // ============================================================
        // Paso 3:
        // Verificar que la URL corresponde nuevamente
        // a la página principal de DemoBlaze.
        // ============================================================

        AssertionManager.assertTrue(
                homePage.isHomePage(),
                "La URL corresponde a la página principal.");

        // ============================================================
        // Paso 4:
        // Verificar que la grilla principal de productos
        // vuelva a estar visible.
        // ============================================================

        AssertionManager.assertTrue(
                homePage.isProductListVisible(),
                "La lista de productos se encuentra visible.");

    }

}