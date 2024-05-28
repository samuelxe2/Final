// Intérprete para un formato de donación simple
public class DonacionInterpreter implements Interpreter {
    private final MensajeHandler mensajeHandler;

    public DonacionInterpreter(MensajeHandler mensajeHandler) {
        this.mensajeHandler = mensajeHandler;
    }

    @Override
    public void interpretar(String texto) {
        // Supongamos que el texto está en formato clave-valor
        String[] partes = texto.split(";");

        for (String parte : partes) {
            String[] keyValue = parte.split(":");
            String clave = keyValue[0].trim();
            String valor = keyValue[1].trim();
            procesarClaveValor(clave, valor);
        }
    }

    private void procesarClaveValor(String clave, String valor) {
        switch (clave) {
            case "MONETARIA":
                mensajeHandler.mostrarMensaje("Procesando donación monetaria de: $" + valor);
                procesarDonacionMonetaria(Double.parseDouble(valor));
                break;
            case "MATERIAL":
                mensajeHandler.mostrarMensaje("Procesando donación de material: " + valor);
                // Aquí podrías llamar a un método para procesar la donación de material si es necesario
                break;
            // Agregar más casos según sea necesario para otras claves
            default:
                // Clave desconocida, ignorar o manejar según sea necesario
                break;
        }
    }

    private void procesarDonacionMonetaria(double cantidad) {

        if (cantidad > 0) {

            mensajeHandler.mostrarMensaje("Donación monetaria procesada exitosamente.");
        } else {

            mensajeHandler.mostrarMensaje("Error: La cantidad de la donación monetaria debe ser mayor que cero.");
        }
    }
}
