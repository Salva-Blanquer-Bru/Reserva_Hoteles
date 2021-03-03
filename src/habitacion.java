import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class habitacion extends JFrame {
    private final JButton h1;
    private final JButton h2;
    private final JButton h3;
    private final JButton h4;
    private final JButton h5;
    private final JButton h6;
    private final JButton h7;
    private final JButton h8;
    private final JButton h9;
    private final JButton h10;
    JButton volver;
    private JButton h11;
    private JButton h12;
    private JButton h13;
    private JButton h14;
    private JButton h15;


    public habitacion() {
        super("Habitaciones");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JPanel general = new JPanel();
        general.setLayout(new GridLayout(3, 5, 20, 10));


        add(general);

        h1 = new JButton("h1");
        h1.addActionListener(new h1ocupada());
        general.add(h1);

        h2 = new JButton("h2");
        h2.addActionListener(new h2ocupada());
        general.add(h2);

        h3 = new JButton("h3");
        h3.addActionListener(new h3ocupada());
        general.add(h3);

        h4 = new JButton("h4");
        h4.setBackground(Color.red);
        general.add(h4);

        h5 = new JButton("h5");
        h5.addActionListener(new h5ocupada());
        general.add(h5);

        h6 = new JButton("h6");
        h6.addActionListener(new h6ocupada());
        general.add(h6);

        h7 = new JButton("h7");
        h7.setBackground(Color.red);
        general.add(h7);

        h8 = new JButton("h8");
        h8.addActionListener(new h8ocupada());
        general.add(h8);

        h9 = new JButton("h9");
        h9.setBackground(Color.red);
        general.add(h9);

        h10 = new JButton("h10 ");
        h10.addActionListener(new h10ocupada());
        general.add(h10);

        volver = new JButton("Volver");
        volver.addActionListener(new atras());
        general.add(new JPanel());
        general.add(new JPanel());
        general.add(volver);

        setSize(600, 400);
        setVisible(true);
    }

    public static void main() {
        new habitacion();

    }

    private static class atras implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    private class h1ocupada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            h1.setBackground(Color.red);
        }
    }


    private class h2ocupada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            h2.setBackground(Color.red);
        }
    }

    private class h3ocupada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            h3.setBackground(Color.red);
        }
    }


    private class h5ocupada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            h5.setBackground(Color.red);
        }
    }

    private class h6ocupada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            h6.setBackground(Color.red);
        }
    }


    private class h8ocupada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            h8.setBackground(Color.red);
        }
    }


    private class h10ocupada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            h10.setBackground(Color.red);
        }
    }

}
