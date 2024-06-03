import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionReal<T> implements Operacion<T> {
    private static final String FILE_NAME = "donaciones.xlsx";
    private static final Logger logger = Logger.getLogger(OperacionReal.class.getName());

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
            logger.log(Level.SEVERE, "Error writing to the file", e);
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Error closing the workbook", e);
            }
        }
    }
}

