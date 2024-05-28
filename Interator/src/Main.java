import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Crear y llenar la colección de donaciones
        DonacionCollection donaciones = new DonacionCollection();
        donaciones.agregarDonacion("1", new Donacion("MONETARIA", "$100"));
        donaciones.agregarDonacion("2", new Donacion("MATERIAL", "Ropa"));
        donaciones.agregarDonacion("3", new Donacion("MONETARIA", "$200"));
        donaciones.agregarDonacion("4", new Donacion("MATERIAL", "Libros"));

        // Crear el manejador de mensajes que usa una ventana de texto
        MensajeHandler mensajeHandler = new VentanaMensajeHandler();

        // Crear el pool de hilos para el procesamiento concurrente
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Procesar cada donación en un hilo separado
        for (Donacion donacion : donaciones) {
            DonacionProcessor processor = new DonacionProcessor(donacion, mensajeHandler);
            executor.execute(processor);
        }

        // Cerrar el pool de hilos
        executor.shutdown();
    }
}