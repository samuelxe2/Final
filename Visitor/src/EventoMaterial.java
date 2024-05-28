public class EventoMaterial extends EventoDonacion {
    private String descripcionEvento;

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    @Override
    public void accept(DonacionVisitor visitor) {
        visitor.visit(this);
    }
}

