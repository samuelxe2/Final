public interface DonacionVisitor {
    void visit(DonacionMonetaria donacion);
    void visit(DonacionMaterial donacion);
    void visit(EventoMonetario evento);
    void visit(EventoMaterial evento);
}
