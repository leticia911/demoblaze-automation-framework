package dataproviders;

import data.model.LoginData;
import data.repository.LoginRepository;
import org.testng.annotations.DataProvider;

import java.util.List;

public final class ExcelDataProvider {

    private ExcelDataProvider() {
    }

    @DataProvider(name = "loginData")
    public static Object[][] loginData() {

        List<LoginData> logins =
                LoginRepository.getAll();

        Object[][] data =
                new Object[logins.size()][1];

        for (int i = 0; i < logins.size(); i++) {

            data[i][0] = logins.get(i);

        }

        return data;

    }

}