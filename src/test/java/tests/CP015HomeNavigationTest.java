package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import utils.AssertionManager;

public class CP015HomeNavigationTest extends BaseTest {

    @Test(description = "CP-015 - Verificar navegación al Home desde el enlace Home")
    public void verifyNavigationUsingHomeLink() {

        // Se instancia la página principal de DemoBlaze.
        HomePage homePage = new HomePage(driver);

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
        // Esta validación mejora la estabilidad del test y evita
        // intentar interactuar con una página que aún no terminó
        // de renderizar.
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