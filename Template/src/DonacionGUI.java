import javax.swing.*;

public class DonacionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Donación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Tipo de donación:");
        userLabel.setBounds(10, 20, 150, 25);
        panel.add(userLabel);

        String[] tiposDeDonacion = {"Monetaria", "Material"};
        JComboBox<String> tipoDonacionBox = new JComboBox<>(tiposDeDonacion);
        tipoDonacionBox.setBounds(160, 20, 165, 25);
        panel.add(tipoDonacionBox);

        JButton confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(10, 80, 150, 25);
        panel.add(confirmarButton);

        confirmarButton.addActionListener(e -> {
            String tipoSeleccionado = (String) tipoDonacionBox.getSelectedItem();
            if ("Monetaria".equals(tipoSeleccionado)) {
                DonacionMonetaria donacionMonetaria = new DonacionMonetaria();
                donacionMonetaria.setMonto(100); // Ejemplo de seteo
                donacionMonetaria.procesarDonacion();
            } else if ("Material".equals(tipoSeleccionado)) {
                DonacionMaterial donacionMaterial = new DonacionMaterial();
                donacionMaterial.setDescripcionMaterial("Ropa"); // Ejemplo de seteo
                donacionMaterial.procesarDonacion();
            }
            JOptionPane.showMessageDialog(panel, "Donación procesada");
        });
    }
}