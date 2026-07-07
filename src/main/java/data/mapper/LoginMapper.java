package data.mapper;

import data.excel.ExcelReader;
import data.model.LoginData;

public class LoginMapper
        implements Mapper<LoginData> {

    @Override
    public LoginData fromRow(int row) {

        LoginData login = new LoginData();

        login.setId(
                Integer.parseInt(
                        ExcelReader.getCellValue(
                                "Login",
                                row,
                                0)));

        login.setUsername(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        1));

        login.setPassword(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        2));

        login.setRole(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        3));

        login.setStatus(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        4));

        login.setLanguage(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        5));

        login.setEnvironment(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        6));

        login.setExpectedResult(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        7));

        login.setDescription(
                ExcelReader.getCellValue(
                        "Login",
                        row,
                        8));

        return login;
    }

}