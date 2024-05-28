import javax.swing.*;
import java.awt.*;

public class DonacionGUI extends JFrame {
    private final JTextField txtCantidad;

    private final Donacion donacion;

    public DonacionGUI() {
        setTitle("Sistema de Donaciones");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 2));

        JLabel lblCantidad = new JLabel("Cantidad donada:");
        txtCantidad = new JTextField();
        JButton btnDonar = new JButton("Donar");

        panel.add(lblCantidad);
        panel.add(txtCantidad);
        panel.add(btnDonar);

        getContentPane().add(panel, BorderLayout.NORTH);

        // Utilizamos la CalculadoraImpuestosEstandar por defecto
        donacion = new Donacion(new CalculadoraImpuestosEstandar());

        btnDonar.addActionListener(e -> {
            donar();
        });
    }

    private void donar() {
        try {
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double totalDonado;
            totalDonado = donacion.procesarDonacion(cantidad);
            double impuestosCobrados = totalDonado - cantidad;

            // Creamos una nueva ventana para mostrar los impuestos
            ImpuestosGUI impuestosGUI = new ImpuestosGUI(cantidad, impuestosCobrados, totalDonado);
            impuestosGUI.setVisible(true);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DonacionGUI donacionGUI = new DonacionGUI();
            donacionGUI.setVisible(true);
        });
    }
}
