package pages;

import actions.UIActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * ===============================================================
 * Clase BasePage
 *
 * Responsabilidad:
 * Proveer las funcionalidades comunes que compartirán todas
 * las páginas del framework.
 *
 * Esta clase implementa el patrón Page Object Model (POM),
 * centralizando las operaciones reutilizables para evitar
 * duplicación de código.
 *
 * Todas las páginas del proyecto (HomePage, LoginPage,
 * ProductPage, CartPage, etc.) heredan de esta clase.
 *
 * Arquitectura:
 *
 * Test
 *    │
 *    ▼
 * HomePage / LoginPage / ProductPage
 *    │
 *    ▼
 * BasePage
 *    │
 *    ▼
 * UIActions
 *    │
 *    ▼
 * WaitUtils
 *    │
 *    ▼
 * Selenium WebDriver
 * ===============================================================
 */
public class BasePage {

    /**
     * Instancia del navegador utilizada durante la ejecución.
     *
     * Se declara como protected para que todas las páginas
     * hijas puedan acceder cuando sea estrictamente necesario.
     */
    protected WebDriver driver;

    /**
     * Encapsula todas las acciones sobre la interfaz gráfica.
     *
     * Las páginas no interactúan directamente con Selenium,
     * sino mediante esta clase.
     */
    protected UIActions actions;

    /**
     * Constructor base.
     *
     * Recibe el WebDriver creado por BaseTest y lo comparte
     * con todas las páginas del framework.
     *
     * @param driver navegador activo.
     */
    public BasePage(WebDriver driver) {

        this.driver = driver;

        this.actions = new UIActions(driver);

    }

    /**
     * ===========================================================
     * Hace clic sobre un elemento.
     *
     * Delega la operación en UIActions para reutilizar
     * waits, logging y reportes.
     *
     * @param locator localizador Selenium.
     * ===========================================================
     */
    protected void click(By locator) {

        actions.click(locator);

    }

    /**
     * ===========================================================
     * Escribe texto en un elemento.
     *
     * Antes de escribir, UIActions espera que el elemento
     * sea visible y limpia el contenido existente.
     *
     * @param locator localizador Selenium.
     * @param text texto a ingresar.
     * ===========================================================
     */
    protected void type(By locator, String text) {

        actions.type(locator, text);

    }

    /**
     * ===========================================================
     * Obtiene el texto visible de un elemento.
     *
     * @param locator localizador Selenium.
     * @return texto del elemento.
     * ===========================================================
     */
    protected String getText(By locator) {

        return actions.getText(locator);

    }

    /**
     * ===========================================================
     * Verifica si un elemento está visible.
     *
     * Se utiliza principalmente para realizar validaciones
     * dentro de las páginas.
     *
     * @param locator localizador Selenium.
     * @return true si el elemento es visible.
     * ===========================================================
     */
    protected boolean isDisplayed(By locator) {

        return actions.isDisplayed(locator);

    }
    /**
     * Espera hasta que la URL contenga un texto determinado.
     */
    protected boolean waitForUrlContains(String text) {

        return actions.waitForUrlContains(text);

    }

    /**
     * Espera hasta que exista al menos un elemento.
     */
    protected void waitForElements(By locator) {

        actions.waitForElements(locator);

    }

    /**
     * ===========================================================
     * Verifica si un elemento está habilitado.
     *
     * Permite validar botones, inputs o controles antes
     * de interactuar con ellos.
     *
     * @param locator localizador Selenium.
     * @return true si el elemento está habilitado.
     * ===========================================================
     */
    protected boolean isEnabled(By locator) {

        return actions.isEnabled(locator);

    }

}