package dataproviders;

import data.model.LoginData;
import data.repository.LoginRepository;
import org.testng.annotations.DataProvider;

import java.util.List;

public final class ExcelDataProvider {

    // Instancia del repositorio para acceder a los datos del Excel.
    private static final LoginRepository repository =
            new LoginRepository();

    private ExcelDataProvider() {
    }

    @DataProvider(name = "loginData")
    public static Object[][] loginData() {

        // Obtiene todos los registros de la hoja "Login".
        List<LoginData> logins =
                repository.getAll();

        // Convierte la lista al formato Object[][] requerido por TestNG.
        Object[][] data =
                new Object[logins.size()][1];

        for (int i = 0; i < logins.size(); i++) {

            data[i][0] = logins.get(i);

        }

        return data;

    }

}