// Implementación abstracta de Command
public abstract class AbstractCommand implements Command {
    protected MensajeHandler mensajeHandler;

    public AbstractCommand(MensajeHandler mensajeHandler) {
        this.mensajeHandler = mensajeHandler;
    }

    protected abstract String obtenerMensaje();

    protected abstract void procesarDonacion();

    @Override
    public void ejecutar() {
        String mensaje = obtenerMensaje();
        procesarDonacion();
        mensajeHandler.mostrarMensaje(mensaje);
    }
}
