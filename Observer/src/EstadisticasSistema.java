public class EstadisticasSistema implements DonacionObserver {
    private VentanaMensajeHandler ventanaMensajeHandler;

    public EstadisticasSistema(VentanaMensajeHandler ventanaMensajeHandler) {
        this.ventanaMensajeHandler = ventanaMensajeHandler;
    }

    @Override
    public void update(Donacion donacion) {
        ventanaMensajeHandler.mostrarMensaje("Estadísticas: Actualizando datos para donación de tipo "
                + donacion.getTipo() + " con detalles: " + donacion.getDetalle());
    }
}
