// Clase para representar una donación monetaria
public class DonacionMonetaria {
    private MensajeHandler mensajeHandler;

    public DonacionMonetaria(MensajeHandler mensajeHandler) {
        this.mensajeHandler = mensajeHandler;
    }

    public void procesarDonacionMonetaria() {
        String mensaje = "Procesando donación monetaria...";
        mensajeHandler.mostrarMensaje(mensaje);
    }
}
