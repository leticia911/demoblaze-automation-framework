package data.excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

public final class ExcelManager {

    private static final String EXCEL_PATH =
            "testdata/AutomationData.xlsx";

    private static Workbook workbook;

    private ExcelManager() {
    }

    public static Workbook getWorkbook() {

        if (workbook == null) {

            try {

                InputStream input =
                        ExcelManager.class
                                .getClassLoader()
                                .getResourceAsStream(EXCEL_PATH);

                if (input == null) {

                    throw new RuntimeException(
                            "No se encontró el archivo: "
                                    + EXCEL_PATH);

                }

                workbook = new XSSFWorkbook(input);

            } catch (IOException e) {

                throw new RuntimeException(
                        "Error abriendo el Excel.",
                        e);

            }

        }

        return workbook;

    }

    public static void closeWorkbook() {

        if (workbook != null) {

            try {

                workbook.close();

                workbook = null;

            } catch (IOException e) {

                throw new RuntimeException(
                        "Error cerrando el Excel.",
                        e);

            }

        }

    }

}