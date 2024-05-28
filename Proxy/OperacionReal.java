import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class OperacionReal<T> implements Operacion<T> {
    private static final String FILE_NAME = "donaciones.xlsx";

    @Override
    public void ejecutar(T dato) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Donaciones");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(dato.toString());

        try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
