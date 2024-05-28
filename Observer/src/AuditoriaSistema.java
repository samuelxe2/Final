public class AuditoriaSistema implements DonacionObserver {
    private VentanaMensajeHandler ventanaMensajeHandler;

    public AuditoriaSistema(VentanaMensajeHandler ventanaMensajeHandler) {
        this.ventanaMensajeHandler = ventanaMensajeHandler;
    }

    @Override
    public void update(Donacion donacion) {
        ventanaMensajeHandler.mostrarMensaje("Auditoría: Registro de cambios para donación de tipo "
                + donacion.getTipo() + " con detalles: " + donacion.getDetalle());
    }
}
