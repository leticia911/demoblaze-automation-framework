package tests;

import data.model.LoginData;
import data.repository.LoginRepository;
import org.testng.annotations.Test;

public class ExcelTest {

    @Test
    public void readExcelTest() {

        // Se crea una instancia del repositorio para acceder a los datos del Excel.
        LoginRepository repository = new LoginRepository();

        // Obtiene el registro con ID = 1.
        LoginData login = repository.getById(1);

        // Muestra el registro obtenido en la consola.
        System.out.println(login);

    }

}