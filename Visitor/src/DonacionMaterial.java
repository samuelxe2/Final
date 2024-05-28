public class DonacionMaterial implements DonacionVisitable {
    private String descripcionMaterial;

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    @Override
    public void accept(DonacionVisitor visitor) {
        visitor.visit(this);
    }
}