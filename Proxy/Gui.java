import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JTextField txtUsuario;
    private JTextField txtDonacion;
    private JButton btnDonar;

    public Gui() {
        setTitle("Sistema de Donaciones");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 1));

        JLabel lblTitulo = new JLabel("Realizar una Donación");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblTitulo);

        JPanel usuarioPanel = new JPanel(new FlowLayout());
        JLabel lblUsuario = new JLabel("Usuario:");
        txtUsuario = new JTextField(15);
        usuarioPanel.add(lblUsuario);
        usuarioPanel.add(txtUsuario);
        panel.add(usuarioPanel);

        JPanel donacionPanel = new JPanel(new FlowLayout());
        JLabel lblDonacion = new JLabel("Donación:");
        txtDonacion = new JTextField(15);
        donacionPanel.add(lblDonacion);
        donacionPanel.add(txtDonacion);
        panel.add(donacionPanel);

        btnDonar = new JButton("Donar");
        panel.add(btnDonar);

        add(panel);

        btnDonar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarDonacion();
            }
        });
    }

    private void realizarDonacion() {
        String usuario = txtUsuario.getText();
        String donacion = txtDonacion.getText();

        VerificadorAcceso verificadorAcceso = new VerificadorAccesoBasico("admin");
        Operacion<String> operacion = new OperacionProxy<>(usuario, verificadorAcceso);

        try {
            operacion.ejecutar(donacion);
            JOptionPane.showMessageDialog(this, "Donación realizada con éxito");
        } catch (SecurityException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
}
