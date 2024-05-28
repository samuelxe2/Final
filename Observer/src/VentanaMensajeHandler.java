import javax.swing.*;

public class VentanaMensajeHandler {
    private JTextArea textArea;

    public VentanaMensajeHandler() {
        JFrame frame = new JFrame("Mensajes de Donaciones");
        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void mostrarMensaje(String mensaje) {
        textArea.append(mensaje + "\n");
    }
}
