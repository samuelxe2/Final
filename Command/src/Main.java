//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear el manejador de mensajes
        MensajeHandler mensajeHandler = new CuadroTextoMensajeHandler();

        // Crear donaciones
        DonacionMonetaria donacionMonetaria = new DonacionMonetaria(mensajeHandler);
        DonacionMaterial donacionMaterial = new DonacionMaterial(mensajeHandler);

        // Crear comandos con las donaciones
        Command procesarMonetaria = new ProcesarDonacionMonetaria(mensajeHandler);
        Command procesarMaterial = new ProcesarDonacionMaterial(mensajeHandler);

        // Configurar el gestor de donaciones con los comandos
        GestorDonaciones gestor = new GestorDonaciones();
        gestor.setCommand(procesarMonetaria);

        // Procesar donaciones
        gestor.procesarDonacion(); // Procesa la donación monetaria

        // Cambiar el comando para procesar otra donación
        gestor.setCommand(procesarMaterial);
        gestor.procesarDonacion(); // Procesa la donación de material
    }
}