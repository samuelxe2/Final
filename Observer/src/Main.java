//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VentanaMensajeHandler ventanaMensajeHandler = new VentanaMensajeHandler();

        Donacion donacion = new Donacion("MONETARIA", "$100");

        NotificacionSistema notificacion = new NotificacionSistema(ventanaMensajeHandler);
        EstadisticasSistema estadisticas = new EstadisticasSistema(ventanaMensajeHandler);
        AuditoriaSistema auditoria = new AuditoriaSistema(ventanaMensajeHandler);

        donacion.addObserver(notificacion);
        donacion.addObserver(estadisticas);
        donacion.addObserver(auditoria);

        // Modificando la donación y notificando a los observadores
        donacion.setTipo("MATERIAL");
        donacion.setDetalle("Ropa");
    }
}