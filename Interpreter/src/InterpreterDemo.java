public class InterpreterDemo {
    public static void main(String[] args) {
        String textoDonacion = "MONETARIA: 100; MATERIAL: Ropa;";
        MensajeHandler mensajeHandler = new ConsolaMensajeHandler();
        Interpreter interpreter = new DonacionInterpreter(mensajeHandler);
        interpreter.interpretar(textoDonacion);
    }
}
