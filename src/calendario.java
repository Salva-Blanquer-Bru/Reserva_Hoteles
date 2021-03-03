import com.toedter.calendar.JCalendar;

import javax.swing.*;
import java.awt.*;

public class calendario extends JFrame {

    JCalendar calendar;

    public calendario() {
        super("Reserva Hoteles");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel general = new JPanel();
        general.setLayout(new GridLayout(3, 1, 20, 1));

        calendar = new JCalendar();

        add(general);
        general.add(calendar);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main() {
        new calendario();

    }
}



