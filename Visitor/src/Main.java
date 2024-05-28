import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DonacionMonetaria donacionMonetaria = new DonacionMonetaria();
        donacionMonetaria.setMonto(500);

        DonacionMaterial donacionMaterial = new DonacionMaterial();
        donacionMaterial.setDescripcionMaterial("Ropa");

        EventoMonetario eventoMonetario = new EventoMonetario();
        eventoMonetario.setMontoEvento(1000);
        eventoMonetario.setFechaEvento("2024-05-27");

        EventoMaterial eventoMaterial = new EventoMaterial();
        eventoMaterial.setDescripcionEvento("Alimentos");
        eventoMaterial.setFechaEvento("2024-05-27");

        ProcesadorDeDonaciones procesador = new ProcesadorDeDonaciones();
        procesador.agregarDonacion(donacionMonetaria);
        procesador.agregarDonacion(donacionMaterial);
        procesador.agregarDonacion(eventoMonetario);
        procesador.agregarDonacion(eventoMaterial);

        // Calcular impuestos
        CalculadorImpuestos calculadorImpuestos = new CalculadorImpuestos();
        procesador.procesarDonaciones(calculadorImpuestos);
        System.out.println("Total impuestos: " + calculadorImpuestos.getTotalImpuestos());

        // Exportar a Excel
        DonacionExcelHelper excelHelper = new DonacionExcelHelper();
        procesador.procesarDonaciones(excelHelper);
        try {
            excelHelper.exportar("donaciones.xlsx");
            JOptionPane.showMessageDialog(null, "Donaciones guardadas en donaciones.xlsx", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(null, "Error al guardar en Excel: " + ioException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

