public class Donacion {
    private CalculadoraImpuestos calculadoraImpuestos;

    public Donacion(CalculadoraImpuestosEstandar calculadoraImpuestosEstandar) {
    }

    public void setCalculadoraImpuestos(CalculadoraImpuestos calculadoraImpuestos) {
        this.calculadoraImpuestos = calculadoraImpuestos;
    }

    public double procesarDonacion(double cantidadDonada) {
        // Procesar la donación utilizando la estrategia de cálculo de impuestos actual
        return calculadoraImpuestos.calcularImpuestos(cantidadDonada);
    }
}