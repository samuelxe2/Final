public class DonacionMonetaria implements DonacionVisitable {
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public void accept(DonacionVisitor visitor) {
        visitor.visit(this);
    }
}