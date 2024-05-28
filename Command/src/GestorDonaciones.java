// Clase invocadora
public class GestorDonaciones {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void procesarDonacion() {
        command.ejecutar();
    }
}
