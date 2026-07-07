package data.excel;

import org.apache.poi.ss.usermodel.*;

public final class ExcelReader {

    private ExcelReader() {
    }

    public static Sheet getSheet(String sheetName) {

        Sheet sheet =
                ExcelManager
                        .getWorkbook()
                        .getSheet(sheetName);

        if (sheet == null) {

            throw new RuntimeException(
                    "No existe la hoja: " + sheetName);

        }

        return sheet;

    }

    public static Row getRow(
            String sheetName,
            int rowNumber) {

        return getSheet(sheetName)
                .getRow(rowNumber);

    }

    public static Cell getCell(
            String sheetName,
            int rowNumber,
            int columnNumber) {

        Row row =
                getRow(sheetName, rowNumber);

        if (row == null) {

            throw new RuntimeException(
                    "No existe la fila: " + rowNumber);

        }

        Cell cell =
                row.getCell(columnNumber);

        if (cell == null) {

            throw new RuntimeException(
                    "No existe la columna: "
                            + columnNumber);

        }

        return cell;

    }

    public static String getCellValue(
            String sheetName,
            int rowNumber,
            int columnNumber) {

        Cell cell =
                getCell(
                        sheetName,
                        rowNumber,
                        columnNumber);

        DataFormatter formatter =
                new DataFormatter();

        return formatter.formatCellValue(cell);

    }

    public static int getLastRow(
            String sheetName) {

        return getSheet(sheetName)
                .getLastRowNum();

    }

    public static boolean sheetExists(
            String sheetName) {

        return ExcelManager
                .getWorkbook()
                .getSheet(sheetName)
                != null;

    }

}