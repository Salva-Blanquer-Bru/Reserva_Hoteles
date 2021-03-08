import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class acciones {

    public static void lector() {
        try {
            File myfile1 = new File("C:\\Users\\salva\\Desktop\\hotel\\src\\Habitaciones.txt");
            Scanner myReader = new Scanner(myfile1);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] div = data.split(" ");

                int id_habitacion = Integer.parseInt(div[0]);
                String calidad = div[1];

                int precio = Integer.parseInt(div[2]);
                boolean estado = Boolean.parseBoolean(div[3]);

                habitacion.habitaciones.add(new habitacion(id_habitacion, calidad, precio, estado));


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            File myfile2 = new File("C:\\Users\\salva\\Desktop\\hotel\\src\\Reservas.txt");
            Scanner myReader = new Scanner(myfile2);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] div = data.split(" ");

                Date fecha_llegada = new Date();
                Date fecha_ida = new Date();

                SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");

                String fecha_entrada = div[0];
                String fecha_salida = div[1];
                try {

                    fecha_llegada = formato.parse(fecha_entrada);
                    fecha_ida = formato.parse(fecha_salida);

                } catch (ParseException e) {
                    e.printStackTrace();
                }
                int id_habitacion = Integer.parseInt(div[2]);
                String nombre = div[3];
                int codigo = Integer.parseInt(div[4]);

                reserva.Reservas.add(new reserva(fecha_llegada, fecha_ida, id_habitacion, nombre, codigo));


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void actualizar_habitaciones() {
        try {
            FileWriter fichero = new FileWriter("C:\\Users\\salva\\Desktop\\hotel\\src\\Habitaciones.txt");

            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 1; i < habitacion.habitaciones.size(); i++) {
                pw.println(habitacion.habitaciones.get(i));

            }

            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void actualizar_reservas() {
        try {
            FileWriter fichero = new FileWriter("C:\\Users\\salva\\Desktop\\hotel\\src\\Reserva.txt");

            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 1; i < reserva.Reservas.size(); i++) {
                pw.println(reserva.Reservas.get(i));

            }

            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String generar_codigo() {
        String codigo = "";
        Random aleatorio = new Random();

        String digitos = "1234567890";

        for (int i = 0; i < 8; i++) {
            codigo += digitos.charAt(aleatorio.nextInt(digitos.length()));
        }
        return codigo;
    }
}
