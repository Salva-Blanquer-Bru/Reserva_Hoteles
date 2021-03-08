import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class opciones {

    static Scanner teclado = new Scanner(System.in);

    public static void reserva() {

        ArrayList<habitacion> tipos = new ArrayList<>();
        Date entrada = new Date();
        Date salida = new Date();

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        teclado.nextLine();

        System.out.println("Introduce tipo de habitacion (individual,doble,premium)");
        String tipo = teclado.nextLine();

        System.out.println("Introduce fecha llegada --> (dd-mm-yyyy)");
        String fecha_entrada = teclado.nextLine();

        System.out.println("Introduce fecha salida --> (dd-mm-yyyy)");
        String fecha_salida = teclado.nextLine();

        try {
            entrada = date.parse(fecha_entrada);
            salida = date.parse(fecha_salida);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Introduzca el nombre");
        String nombre = teclado.nextLine();

        for (int i = 0; i < habitacion.habitaciones.size(); i++) {

            if (tipo.equalsIgnoreCase(habitacion.habitaciones.get(i).getTipo())) {
                tipos.add(habitacion.habitaciones.get(i));
            }
        }

        Random random = new Random();
        int aleatorio = tipos.get(random.nextInt(tipos.size())).getNumHabitacion();
        reserva.Reservas.add(new reserva(entrada, salida, aleatorio, nombre, Integer.parseInt(acciones.generar_codigo())));
        acciones.actualizar_reservas();

    }


    public static void cancelar_reserva() {

        teclado.nextLine();
        System.out.println("Introduzca el nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca el codigo de la reserva");
        int codigo = teclado.nextInt();

        for (int i = 0; i < reserva.Reservas.size(); i++) {

            if (nombre.equalsIgnoreCase(reserva.Reservas.get(i).getNum_Usuario()) && codigo == reserva.Reservas.get(i).getCodReserva()) {
                reserva.Reservas.remove(i);
                acciones.actualizar_reservas();


            }
        }

    }

    public static void ver_reservar() {

        for (int i = 0; i < reserva.Reservas.size(); i++) {
            System.out.println(reserva.Reservas.get(i) + "\t");
        }
    }

    public static void añadir_habitacion() {

        teclado.nextLine();
        System.out.println("dime el tipo de habitacion(individual/doble/premium");
        String tipo = teclado.nextLine();
        if (tipo.equalsIgnoreCase("individual")) {

            habitacion.habitaciones.add(new habitacion(habitacion.habitaciones.size() + 1, tipo, 20, true));
        } else if (tipo.equalsIgnoreCase("doble")) {

            habitacion.habitaciones.add(new habitacion(habitacion.habitaciones.size() + 1, tipo, 75, true));
        } else if (tipo.equalsIgnoreCase("premium")) {

            habitacion.habitaciones.add(new habitacion(habitacion.habitaciones.size() + 1, tipo, 500, true));
        }
        acciones.actualizar_habitaciones();
    }

    public static void des_hab_habitacion() {

        System.out.println("\t\t\tSeleccione una opcion");
        System.out.println();
        System.out.println("\t\t\t1.habilitar habitaciones");
        System.out.println("\t\t\t2.deshabilitar habitaciones");
        System.out.println("\t\t\t3.volver");
        System.out.println("----------------------------------------");

        int opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                for (int i = 0; i < habitacion.habitaciones.size(); i++) {
                    if (habitacion.habitaciones.get(i).getEstado() == false) {
                        System.out.println(habitacion.habitaciones.get(i));
                    }
                }

                System.out.println("Introduce el nº la habitacion a habilitar");
                int habilitar = teclado.nextInt();
                habitacion.habitaciones.get(habilitar).setEstado(true);
                acciones.actualizar_habitaciones();
                break;

            case 2:

                for (int i = 0; i < habitacion.habitaciones.size(); i++) {

                    if (habitacion.habitaciones.get(i).getEstado() == true) {
                        System.out.println(habitacion.habitaciones.get(i));
                    }
                }

                System.out.println("Introduce el nº la habitacion a deshabilitar");
                int deshabilitar = teclado.nextInt();

                habitacion.habitaciones.get(deshabilitar).setEstado(false);
                acciones.actualizar_habitaciones();
                break;
            case 3:
                reserva();
                break;
        }

    }
}
