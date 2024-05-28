import javax.swing.JOptionPane;

// Clase base para los manejadores
public abstract class ManejadorBase implements ManejadorDonacion {
    private ManejadorDonacion siguiente;

    @Override
    public void setSiguienteManejador(ManejadorDonacion siguiente) {
        this.siguiente = siguiente;
    }

    public void pasarAlSiguiente(Donacion donacion) {
        if (siguiente != null) {
            siguiente.manejarDonacion(donacion);
        } else {
            JOptionPane.showMessageDialog(null, "Nadie puede manejar esta donación.");
        }
    }
}
