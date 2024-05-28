// Implementación de MensajeHandler que muestra los mensajes en la consola
public class ConsolaMensajeHandler implements MensajeHandler {
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

