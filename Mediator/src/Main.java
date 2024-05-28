//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DonacionCollection donaciones = new DonacionCollection();
        donaciones.agregarDonacion("1", new Donacion("MONETARIA", "$100"));
        donaciones.agregarDonacion("2", new Donacion("MATERIAL", "Ropa"));
        donaciones.agregarDonacion("3", new Donacion("MONETARIA", "$200"));
        donaciones.agregarDonacion("4", new Donacion("MATERIAL", "Libros"));

        MensajeHandler mensajeHandler = new VentanaMensajeHandler();
        DonacionMediator mediator = new DonacionMediator(mensajeHandler);

        for (Donacion donacion : donaciones) {
            mediator.procesarDonacion(donacion);
        }

        mediator.shutdown();
    }
}