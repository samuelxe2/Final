public class Main {
    public static void main(String[] args) {
        VerificadorAcceso verificadorAcceso = new VerificadorAccesoBasico();

        Operacion<String> operacionAdmin = new OperacionProxy<>("admin", verificadorAcceso);
        operacionAdmin.ejecutar("Donación de libros");  // Debe permitir la operación y almacenar en Excel.

        Operacion<String> operacionUsuario = new OperacionProxy<>("usuario", verificadorAcceso);
        try {
            operacionUsuario.ejecutar("Donación de ropa");  // Debe denegar la operación.
        } catch (SecurityException e) {
            System.out.println(e.getMessage());  // Manejo de excepción o logging.
        }
    }
}