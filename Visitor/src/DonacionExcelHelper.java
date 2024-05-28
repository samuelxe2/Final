import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class DonacionExcelHelper implements DonacionVisitor {
    private Workbook workbook;
    private Sheet sheet;
    private int rowIndex;

    public DonacionExcelHelper() {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Donaciones");
        rowIndex = 0;
    }

    @Override
    public void visit(DonacionMonetaria donacion) {
        Row row = sheet.createRow(rowIndex++);
        row.createCell(0).setCellValue("Donacion Monetaria");
        row.createCell(1).setCellValue(donacion.getMonto());
    }

    @Override
    public void visit(DonacionMaterial donacion) {
        Row row = sheet.createRow(rowIndex++);
        row.createCell(0).setCellValue("Donacion Material");
        row.createCell(1).setCellValue(donacion.getDescripcionMaterial());
    }

    @Override
    public void visit(EventoMonetario evento) {
        Row row = sheet.createRow(rowIndex++);
        row.createCell(0).setCellValue("Evento Monetario");
        row.createCell(1).setCellValue(evento.getMontoEvento());
    }

    @Override
    public void visit(EventoMaterial evento) {
        Row row = sheet.createRow(rowIndex++);
        row.createCell(0).setCellValue("Evento Material");
        row.createCell(1).setCellValue(evento.getDescripcionEvento());
    }

    public void exportar(String filePath) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        }
        workbook.close();
    }
}
