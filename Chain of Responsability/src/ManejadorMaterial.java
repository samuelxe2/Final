import javax.swing.JOptionPane;

// Implementación de otro manejador específico
public class ManejadorMaterial extends ManejadorBase {
    @Override
    public void manejarDonacion(Donacion donacion) {
        if (donacion.getTipo().equals("Material")) {
            // Procesar la donación de material
            JOptionPane.showMessageDialog(null, "Donación de material recibida.");
        } else {
            pasarAlSiguiente(donacion);
        }
    }
}
