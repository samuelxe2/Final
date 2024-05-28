import javax.swing.*;
import java.awt.*;

public class ImpuestosGUI extends JFrame {
    public ImpuestosGUI(double cantidad, double impuestosCobrados, double totalDonado) {
        setTitle("Impuestos Cobrados");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        JLabel lblCantidad = new JLabel("Cantidad donada: " + cantidad);
        JLabel lblImpuestos = new JLabel("Impuestos cobrados: " + impuestosCobrados);
        JLabel lblTotalDonado = new JLabel("Total donado después de impuestos: " + totalDonado);

        panel.add(lblCantidad);
        panel.add(lblImpuestos);
        panel.add(lblTotalDonado);

        getContentPane().add(panel, BorderLayout.CENTER);
    }
}
