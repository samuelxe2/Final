// Comando para procesar una donación monetaria
public class ProcesarDonacionMonetaria extends AbstractCommand {
    public ProcesarDonacionMonetaria(MensajeHandler mensajeHandler) {
        super(mensajeHandler);
    }

    @Override
    protected String obtenerMensaje() {
        return "Procesando donación monetaria...";
    }

    @Override
    protected void procesarDonacion() {
        // Lógica para procesar la donación monetaria
    }
}
