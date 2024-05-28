// Comando para procesar una donación de material
public class ProcesarDonacionMaterial extends AbstractCommand {
    public ProcesarDonacionMaterial(MensajeHandler mensajeHandler) {
        super(mensajeHandler);
    }

    @Override
    protected String obtenerMensaje() {
        return "Procesando donación de material...";
    }

    @Override
    protected void procesarDonacion() {
        // Lógica para procesar la donación de material
    }
}
