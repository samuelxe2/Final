import javax.swing.*;
import java.awt.*;

public class VentanaMensajeHandler implements MensajeHandler {
    private JTextArea textArea;

    public VentanaMensajeHandler() {
        JFrame frame = new JFrame("Registro de Donaciones");
        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        textArea.append(mensaje + "\n");
    }
}
