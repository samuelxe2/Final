import java.util.logging.Logger;
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        VerificadorAcceso verificadorAcceso = new VerificadorAccesoBasico("admin");

        Operacion<String> operacionAdmin = new OperacionProxy<>("admin", verificadorAcceso);
        operacionAdmin.ejecutar("Donación de libros");  // Debe permitir la operación y almacenar en Excel.

        Operacion<String> operacionUsuario = new OperacionProxy<>("usuario", verificadorAcceso);
        try {
            operacionUsuario.ejecutar("Donación de ropa");  // Debe denegar la operación.
        } catch (SecurityException e) {
            logger.severe(e.getMessage());  // Logging de la excepción.
        }
    }
}
