import javax.swing.*;
import java.awt.*;

public class MainG extends JFrame {

    public MainG() {
        super("Login");


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JPanel Menu = new JPanel();
        Menu.setLayout(new GridLayout(3, 1, 5, 5));


        JPanel VerContraseņa = new JPanel();
        VerContraseņa.add(new JLabel("Contraseņa:"));
        VerContraseņa.add(new JLabel(), BorderLayout.CENTER);

        JPanel GenContraseņa = new JPanel();
        GenContraseņa.add(new JButton("Generar contraseņa"), BorderLayout.WEST);

        JPanel opciones = new JPanel();
        opciones.add(new Checkbox("MAYUSCULAS"));
        opciones.add(new Checkbox("minusculas"));
        opciones.add(new Checkbox("Numeros"));
        opciones.add(new Checkbox("Simbolos"));


        add(Menu);

        Menu.add(VerContraseņa);

        Menu.add(opciones);

        Menu.add(GenContraseņa);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainG();

    }
}

