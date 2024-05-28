public class DonacionMonetaria extends DonacionBase {
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    protected void obtenerDetalles() {
        // Implementar lógica para obtener detalles de la donación monetaria
    }

    @Override
    protected void confirmarDonacion() {
        // Implementar lógica para confirmar la donación monetaria
    }

    @Override
    protected void finalizarDonacion() {
        // Implementar lógica para finalizar la donación monetaria
    }
}