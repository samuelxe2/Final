import javax.swing.JOptionPane;

// Implementación de un manejador específico
public class ManejadorMonetario extends ManejadorBase {
    @Override
    public void manejarDonacion(Donacion donacion) {
        if (donacion.getTipo().equals("Monetaria")) {
            // Procesar la donación monetaria
            JOptionPane.showMessageDialog(null, "Donación monetaria recibida.");
        } else {
            pasarAlSiguiente(donacion);
        }
    }
}
