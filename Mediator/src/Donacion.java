public class Donacion {
    private String tipo;
    private String detalle;

    public Donacion(String tipo, String detalle) {
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDetalle() {
        return detalle;
    }
}
