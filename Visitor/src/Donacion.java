public abstract class Donacion implements DonacionVisitable {
    private String identificador;

    public Donacion(String identificador) {
        this.identificador = identificador;
    }

    public abstract void procesarDonacion(ProcesadorDeDonaciones procesador);

    public abstract double getCuentaBancaria();
}