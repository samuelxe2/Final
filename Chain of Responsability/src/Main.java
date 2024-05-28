//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de los manejadores
        ManejadorDonacion manejadorMonetario = new ManejadorMonetario();
        ManejadorDonacion manejadorMaterial = new ManejadorMaterial();

        // Configurar la cadena de responsabilidad
        manejadorMonetario.setSiguienteManejador(manejadorMaterial);

        // Simular una donación monetaria
        Donacion donacionMonetaria = new Donacion("Monetaria");
        manejadorMonetario.manejarDonacion(donacionMonetaria);

        // Simular una donación de material
        Donacion donacionMaterial = new Donacion("Material");
        manejadorMonetario.manejarDonacion(donacionMaterial);

        // Simular una donación desconocida
        Donacion donacionDesconocida = new Donacion("Desconocida");
        manejadorMonetario.manejarDonacion(donacionDesconocida);
    }
}