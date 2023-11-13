package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public Ventana() {
       
        setTitle("Hola mundo");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        
        JLabel usernameLabel = new JLabel("Nombre de Usuario:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                
                if (isValidUser(username, password)) {
                    JOptionPane.showMessageDialog(Ventana.this, "Bienvenido", "Usuario correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Ventana.this, "Usuario invalido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

       
        panel.add(loginButton);

        
        add(panel);

        
        setVisible(true);
    }

    // Método para verificar el usuario y la contraseña (puedes personalizarlo)
    private boolean isValidUser(String username, String password) {
        // En este ejemplo, se asume que el usuario es "admin" y la contraseña es "password"
        return "Gaby Ortiz".equals(username) && "Soltera3000".equals(password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ventana();
            }
        });
    }
}
