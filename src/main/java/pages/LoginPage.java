package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * ===============================================================
 * Clase LoginPage
 *
 * Representa el modal de autenticación de DemoBlaze.
 *
 * Responsabilidades:
 * - Abrir el modal Login.
 * - Completar usuario y contraseña.
 * - Ejecutar el login.
 * - Cerrar el modal.
 * - Verificar si el modal se encuentra visible.
 *
 * Esta clase sigue el patrón Page Object Model (POM),
 * encapsulando todos los elementos y acciones relacionadas
 * con el proceso de autenticación.
 * ===============================================================
 */
public class LoginPage extends BasePage {

    /**
     * Enlace Login del menú superior.
     */
    private final By loginLink =
            By.id("login2");

    /**
     * Modal Login.
     */
    private final By loginModal =
            By.id("logInModal");

    /**
     * Campo Username.
     */
    private final By username =
            By.id("loginusername");

    /**
     * Campo Password.
     */
    private final By password =
            By.id("loginpassword");

    /**
     * Botón Log In.
     */
    private final By loginButton =
            By.xpath("//button[text()='Log in']");

    /**
     * Botón Close.
     */
    private final By closeButton =
            By.xpath("//div[@id='logInModal']//button[text()='Close']");

    /**
     * Nombre del usuario autenticado.
     */
    private final By welcomeUser =
            By.id("nameofuser");

    /**
     * Constructor.
     *
     * @param driver navegador activo.
     */
    public LoginPage(WebDriver driver) {

        super(driver);

    }

    /**
     * ===========================================================
     * Abre el modal Login.
     * ===========================================================
     */
    public void openLoginModal() {

        click(loginLink);

    }

    /**
     * ===========================================================
     * Ingresa el nombre de usuario.
     * ===========================================================
     */
    public void enterUsername(String user) {

        type(username, user);

    }

    /**
     * ===========================================================
     * Ingresa la contraseña.
     * ===========================================================
     */
    public void enterPassword(String pass) {

        type(password, pass);

    }

    /**
     * ===========================================================
     * Hace clic en el botón Log In.
     * ===========================================================
     */
    public void clickLogin() {

        click(loginButton);

    }

    /**
     * ===========================================================
     * Ejecuta el flujo completo de autenticación.
     * ===========================================================
     */
    public void login(String user, String pass) {

        enterUsername(user);

        enterPassword(pass);

        clickLogin();

    }

    /**
     * ===========================================================
     * Cierra el modal Login.
     * ===========================================================
     */
    public void closeLoginModal() {

        click(closeButton);

    }

    /**
     * ===========================================================
     * Verifica si el modal Login está visible.
     * ===========================================================
     */
    public boolean isLoginModalVisible() {

        return isDisplayed(loginModal);

    }

    /**
     * ===========================================================
     * Verifica si el usuario inició sesión.
     *
     * DemoBlaze muestra un mensaje:
     * Welcome nombreUsuario
     * ===========================================================
     */
    public boolean isUserLogged() {

        return isDisplayed(welcomeUser);

    }

}