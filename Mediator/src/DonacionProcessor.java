public class DonacionProcessor implements Runnable {
    private Donacion donacion;
    private DonacionMediator mediator;

    public DonacionProcessor(Donacion donacion, DonacionMediator mediator) {
        this.donacion = donacion;
        this.mediator = mediator;
    }

    @Override
    public void run() {
        switch (donacion.getTipo()) {
            case "MONETARIA":
                mediator.mostrarMensaje("Procesando donación monetaria de: " + donacion.getDetalle());
                procesarDonacionMonetaria(donacion.getDetalle());
                break;
            case "MATERIAL":
                mediator.mostrarMensaje("Procesando donación de material: " + donacion.getDetalle());
                procesarDonacionMaterial(donacion.getDetalle());
                break;
            default:
                mediator.mostrarMensaje("Tipo de donación desconocido: " + donacion.getTipo());
                break;
        }
    }

    private void procesarDonacionMonetaria(String cantidad) {
        // Lógica adicional para procesar la donación monetaria
        mediator.mostrarMensaje("Donación monetaria de " + cantidad + " procesada.");
    }

    private void procesarDonacionMaterial(String tipoMaterial) {
        // Lógica adicional para procesar la donación de material
        mediator.mostrarMensaje("Donación de material " + tipoMaterial + " procesada.");
    }
}
