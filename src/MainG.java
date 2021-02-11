import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainG extends JFrame {
    public JButton GenContraseña;
    public JLabel contraseña;

    public MainG() {
        super("Generador De Contraseñas");


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JPanel Menu = new JPanel();
        Menu.setLayout(new GridLayout(3, 1, 5, 5));
        Menu.add(new JLabel("Contraseña:"));
        new JLabel("Contraseña:");


        contraseña = (new JLabel(""));
        // GenContraseña.setLayout(new FlowLayout());
        GenContraseña = new JButton("Generar contraseña");
        GenContraseña.addActionListener(new ListenerButton());
        // GenContraseña.setSize(10,10);


        JPanel opciones = new JPanel();
        opciones.setLayout(new GridLayout(4, 1, 5, 5));
        opciones.add(new Checkbox("MAYUSCULAS"));
        opciones.add(new Checkbox("minusculas"));
        opciones.add(new Checkbox("Numeros"));
        opciones.add(new Checkbox("Simbolos"));

        JPanel LongitudContraseña = new JPanel();
        JProgressBar progressBar = new JProgressBar();

        JSlider sliderContra;
        LongitudContraseña.add(sliderContra = new JSlider(JSlider.HORIZONTAL, 0, 20, 5), BorderLayout.PAGE_START);
        JTextField NumContraseña;
        sliderContra.setBorder(new TitledBorder("Deslizame"));
        progressBar.setModel(sliderContra.getModel());
        LongitudContraseña.add(NumContraseña = new JTextField("25"), BorderLayout.SOUTH);
        sliderContra.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int NumberCharac = sliderContra.getValue();
                NumContraseña.setText(Integer.toString(NumberCharac));
            }
        });

        add(Menu);

        Menu.add(contraseña);
        Menu.add(GenContraseña);


        Menu.add(opciones);
//  Menu.add(GenContraseña);
        Menu.add(LongitudContraseña);
        JPanel pBar = new JPanel();
        pBar.setLayout(new FlowLayout());
        pBar.add(progressBar);
        progressBar.setSize(10, 10);
        Menu.add(pBar);

        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainG();
    }

    private class ListenerButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            contraseña.setText("prueba");
        }
    }


}

