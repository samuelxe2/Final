import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DonacionMediator {
    private MensajeHandler mensajeHandler;
    private ExecutorService executor;

    public DonacionMediator(MensajeHandler mensajeHandler) {
        this.mensajeHandler = mensajeHandler;
        this.executor = Executors.newFixedThreadPool(2);
    }

    public void procesarDonacion(Donacion donacion) {
        DonacionProcessor processor = new DonacionProcessor(donacion, this);
        executor.execute(processor);
    }

    public void mostrarMensaje(String mensaje) {
        mensajeHandler.mostrarMensaje(mensaje);
    }

    public void shutdown() {
        executor.shutdown();
    }
}
