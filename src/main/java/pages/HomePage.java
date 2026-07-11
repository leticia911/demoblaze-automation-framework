package pages;

import config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Representa la página principal (Home) de DemoBlaze.
 *
 * Responsabilidades:
 * - Navegar mediante el logo y el enlace Home.
 * - Abrir un producto desde la grilla.
 * - Verificar que el Home se encuentre cargado.
 */
public class HomePage extends BasePage {

    // Logo de DemoBlaze.
    private final By logo =
            By.id("nava");

    // Enlace Home del menú superior.
    private final By homeLink =
            By.linkText("Home");

    // Contenedor de la lista de productos.
    private final By productList =
            By.id("tbodyid");

    // Primer producto visible de la grilla.
    private final By firstProduct =
            By.cssSelector("#tbodyid .card-title a");

    public HomePage(WebDriver driver) {

        super(driver);

    }

    /**
     * CP-001
     * Hace clic sobre el logo de DemoBlaze.
     */
    public void clickLogo() {

        click(logo);

    }

    /**
     * Hace clic sobre el enlace Home.
     */
    public void clickHome() {

        click(homeLink);

    }

    /**
     * CP-015
     * Abre el primer producto disponible de la página principal.
     *
     * @return instancia de ProductPage.
     */
    public ProductPage openFirstProduct() {

        click(firstProduct);

        return new ProductPage(driver);

    }

    /**
     * Devuelve la URL actual.
     */
    public String getUrl() {

        return driver.getCurrentUrl();

    }

    /**
     * Verifica que el navegador se encuentre en la página principal.
     */
    public boolean isHomePage() {

        String url = driver.getCurrentUrl();

        return url.equals(ConfigReader.getBaseUrl())
                || url.endsWith("index.html");

    }

    /**
     * Verifica que la grilla de productos sea visible.
     */
    public boolean isProductListVisible() {

        return isDisplayed(productList);

    }

}