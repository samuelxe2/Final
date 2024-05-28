public class EventoMonetario extends EventoDonacion {
    private double montoEvento;

    public double getMontoEvento() {
        return montoEvento;
    }

    public void setMontoEvento(double montoEvento) {
        this.montoEvento = montoEvento;
    }

    @Override
    public void accept(DonacionVisitor visitor) {
        visitor.visit(this);
    }
}
