// Interfaz para manejar las solicitudes
public interface ManejadorDonacion {
    void manejarDonacion(Donacion donacion);
    void setSiguienteManejador(ManejadorDonacion siguiente);
}
