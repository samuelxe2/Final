public class DonacionMaterial extends DonacionBase {
    private String descripcionMaterial;

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    @Override
    protected void obtenerDetalles() {
        // Implementar lógica para obtener detalles de la donación material
    }

    @Override
    protected void confirmarDonacion() {
        // Implementar lógica para confirmar la donación material
    }

    @Override
    protected void finalizarDonacion() {
        // Implementar lógica para finalizar la donación material
    }
}