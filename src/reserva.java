import com.toedter.calendar.JCalendar;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class reserva extends JFrame {

    JLabel NombreYApCliente;
    JButton CalendarioBtn;
    JButton volver;

    public reserva(){
        super("Reserva Hoteles");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JPanel general = new JPanel();
        general.setLayout(new GridLayout(3, 1, 20, 1));

        String nombreyAp = JOptionPane.showInputDialog("Escriba el nombre y apellido del cliente");
        NombreYApCliente = new JLabel(nombreyAp);
        NombreYApCliente.setBorder(new TitledBorder("Nombre y apellido del Cliente"));

        CalendarioBtn = new JButton("Calendario");
        CalendarioBtn.addActionListener(new VerCalendario());

        volver = new JButton("Volver");
        volver.addActionListener(new atras());

        add(general);
        general.add(NombreYApCliente);
        general.add(CalendarioBtn);
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
            Calendario.main();


        }

}

    private static class atras implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {



        }

}}

