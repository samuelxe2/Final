public class CalculadoraImpuestosEstandar implements CalculadoraImpuestos {
    @Override
    public double calcularImpuestos(double cantidad) {
        // Implementación del cálculo de impuestos estándar
        return cantidad * 0.1; // Por ejemplo, 10% de impuestos
    }
}
