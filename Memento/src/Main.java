//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Donacion donacion = new Donacion("MONETARIA", "$100");
        DonacionCareTaker careTaker = new DonacionCareTaker();
        MensajeHandler mensajeHandler = new VentanaMensajeHandler();

        // Guardar estado inicial
        careTaker.save(donacion);
        mensajeHandler.mostrarMensaje("Estado inicial guardado: " + donacion.getTipo() + ", " + donacion.getDetalle());

        // Modificar la donación
        donacion.setTipo("MATERIAL");
        donacion.setDetalle("Ropa");
        careTaker.save(donacion);
        mensajeHandler.mostrarMensaje("Estado modificado y guardado: " + donacion.getTipo() + ", " + donacion.getDetalle());

        // Deshacer el último cambio
        careTaker.undo(donacion);
        mensajeHandler.mostrarMensaje("Estado después de deshacer: " + donacion.getTipo() + ", " + donacion.getDetalle());

        // Deshacer el cambio inicial
        careTaker.undo(donacion);
        mensajeHandler.mostrarMensaje("Estado después de deshacer: " + donacion.getTipo() + ", " + donacion.getDetalle());
    }
}