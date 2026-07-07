package tests;

import data.model.LoginData;
import data.repository.LoginRepository;
import org.testng.annotations.Test;

public class ExcelTest {

    @Test
    public void readExcelTest() {

        LoginData login =
                LoginRepository.getById(1);

        System.out.println(login);

    }

}
