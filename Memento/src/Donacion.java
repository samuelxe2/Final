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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public DonacionMemento save() {
        return new DonacionMemento(tipo, detalle);
    }

    public void restore(DonacionMemento memento) {
        this.tipo = memento.getTipo();
        this.detalle = memento.getDetalle();
    }

    public static class DonacionMemento {
        private final String tipo;
        private final String detalle;

        public DonacionMemento(String tipo, String detalle) {
            this.tipo = tipo;
            this.detalle = detalle;
        }

        private String getTipo() {
            return tipo;
        }

        private String getDetalle() {
            return detalle;
        }
    }
}
