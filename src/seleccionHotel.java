import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class seleccionHotel extends JFrame {


    JButton cancelarBtn;
    JButton reservarBtn;

    public seleccionHotel(){
        super("Reserva Hoteles");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JPanel general = new JPanel();
        general.setLayout(new GridLayout(3, 2, 20, 1));


        JMenuBar mb=new JMenuBar();
        JMenu menuHoteles = new JMenu("Seleccione un hotel");

        JMenuItem hotel1 = new JMenuItem("Hotel 1");

        JMenuItem hotel2 = new JMenuItem("Hotel 2");


        cancelarBtn = new JButton("Cancelar");

        cancelarBtn.setBackground(Color.red);

        reservarBtn = new JButton("Reservar");
        reservarBtn.addActionListener(new reservar());

        menuHoteles.add(hotel1);
        menuHoteles.add(hotel2);
        add(general);
        mb.add(menuHoteles);
        setJMenuBar(mb);

        general.add(new JLabel());
        general.add(new JLabel());
        general.add(new JLabel());
        general.add(new JLabel());

        general.add(cancelarBtn);
        general.add(reservarBtn);

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new seleccionHotel();

    }
    private static class reservar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            reserva.main();


        }
}}

