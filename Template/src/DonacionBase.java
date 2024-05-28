
public abstract class DonacionBase {

    public final void procesarDonacion() {
        obtenerDetalles();
        confirmarDonacion();
        finalizarDonacion();
    }

    protected abstract void obtenerDetalles();
    protected abstract void confirmarDonacion();
    protected abstract void finalizarDonacion();
}
