public class NotificacionSistema implements DonacionObserver {
    private VentanaMensajeHandler ventanaMensajeHandler;

    public NotificacionSistema(VentanaMensajeHandler ventanaMensajeHandler) {
        this.ventanaMensajeHandler = ventanaMensajeHandler;
    }

    @Override
    public void update(Donacion donacion) {
        ventanaMensajeHandler.mostrarMensaje("Notificación: Se ha actualizado la donación de tipo "
                + donacion.getTipo() + " con detalles: " + donacion.getDetalle());
    }
}
