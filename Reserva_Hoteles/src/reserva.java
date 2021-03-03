import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class reserva extends JFrame {

    JButton escHabitacion;
    JLabel NombreYApCliente;
    JButton CalendarioBtn;
    JButton volver;

    public reserva() {
        super("Reserva Hoteles");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setLayout(new FlowLayout());


        JPanel general = new JPanel();
        general.setLayout(new GridLayout(2, 1, 10, 10));

        general.setBorder(new TitledBorder(""));
        String nombreyAp = JOptionPane.showInputDialog("Escriba el nombre y apellido del cliente");
        NombreYApCliente = new JLabel(nombreyAp);
        NombreYApCliente.setBorder(new TitledBorder("Nombre y apellido del Cliente"));

        CalendarioBtn = new JButton("calendario");
        CalendarioBtn.addActionListener(new VerCalendario());

        volver = new JButton("Volver");
        volver.addActionListener(new atras());

        escHabitacion = new JButton("Habitaciones");
        escHabitacion.addActionListener(new escogerHabitacion());

        add(general);
        general.add(NombreYApCliente);
        general.add(CalendarioBtn);
        general.add(new JPanel());
        general.add(escHabitacion);
        general.add(volver);


        setSize(400, 400);
        setVisible(true);
    }

    public static void main() {
        new reserva();

    }

    private static class VerCalendario implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calendario.main();


        }

    }

    private static class escogerHabitacion implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            habitacion.main();


        }

    }

    private static class atras implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
}

