package tests;

import dataproviders.ExcelDataProvider;
import data.model.LoginData;
import org.testng.annotations.Test;

public class LoginDataProviderTest {

    @Test(dataProvider = "loginData",
            dataProviderClass = ExcelDataProvider.class)
    public void printLoginData(LoginData login) {

        System.out.println("--------------------------------");

        System.out.println("ID: " + login.getId());

        System.out.println("Usuario: "
                + login.getUsername());

        System.out.println("Password: "
                + login.getPassword());

        System.out.println("Rol: "
                + login.getRole());

        System.out.println("Estado: "
                + login.getStatus());

    }

}