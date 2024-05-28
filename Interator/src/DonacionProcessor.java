public class DonacionProcessor implements Runnable {
    private Donacion donacion;
    private MensajeHandler mensajeHandler;

    public DonacionProcessor(Donacion donacion, MensajeHandler mensajeHandler) {
        this.donacion = donacion;
        this.mensajeHandler = mensajeHandler;
    }

    @Override
    public void run() {
        switch (donacion.getTipo()) {
            case "MONETARIA":
                mensajeHandler.mostrarMensaje("Procesando donación monetaria de: " + donacion.getDetalle());
                procesarDonacionMonetaria(donacion.getDetalle());
                break;
            case "MATERIAL":
                mensajeHandler.mostrarMensaje("Procesando donación de material: " + donacion.getDetalle());
                procesarDonacionMaterial(donacion.getDetalle());
                break;
            default:
                mensajeHandler.mostrarMensaje("Tipo de donación desconocido: " + donacion.getTipo());
                break;
        }
    }

    private void procesarDonacionMonetaria(String cantidad) {
        // Lógica adicional para procesar la donación monetaria
        mensajeHandler.mostrarMensaje("Donación monetaria de " + cantidad + " procesada.");
    }

    private void procesarDonacionMaterial(String tipoMaterial) {
        // Lógica adicional para procesar la donación de material
        mensajeHandler.mostrarMensaje("Donación de material " + tipoMaterial + " procesada.");
    }
}
