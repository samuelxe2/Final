import javax.swing.JOptionPane;

// Implementación de MensajeHandler que muestra mensajes en un cuadro de texto
public class CuadroTextoMensajeHandler implements MensajeHandler {
    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
