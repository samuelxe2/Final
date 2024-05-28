// Clase para representar una donación de material
public class DonacionMaterial {
    private MensajeHandler mensajeHandler;

    public DonacionMaterial(MensajeHandler mensajeHandler) {
        this.mensajeHandler = mensajeHandler;
    }

    public void procesarDonacionMaterial() {
        String mensaje = "Procesando donación de material...";
        mensajeHandler.mostrarMensaje(mensaje);
    }
}

