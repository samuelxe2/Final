public class CalculadorImpuestos implements DonacionVisitor {
    private double totalImpuestos;

    public double getTotalImpuestos() {
        return totalImpuestos;
    }

    @Override
    public void visit(DonacionMonetaria donacion) {
        // Lógica para calcular impuestos para donaciones monetarias
        totalImpuestos += donacion.getMonto() * 0.1; // Ejemplo de cálculo
    }

    @Override
    public void visit(DonacionMaterial donacion) {
        // Lógica para calcular impuestos para donaciones materiales
        totalImpuestos += 50; // Ejemplo de cálculo
    }

    @Override
    public void visit(EventoMonetario evento) {
        // Lógica para calcular impuestos para eventos monetarios
        totalImpuestos += evento.getMontoEvento() * 0.05; // Ejemplo de cálculo
    }

    @Override
    public void visit(EventoMaterial evento) {
        // Lógica para calcular impuestos para eventos materiales
        totalImpuestos += 30; // Ejemplo de cálculo
    }
}
