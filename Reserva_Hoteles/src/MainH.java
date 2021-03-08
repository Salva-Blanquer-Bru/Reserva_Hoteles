import java.util.Scanner;

public class MainH {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


        boolean repite = true;
        while (repite == true) {
            habitacion.habitaciones.clear();
            reserva.Reservas.clear();
            acciones.lector();
            System.out.println();
            System.out.println("____________HOTELES__TRIVAGO___________");
            System.out.println();
            System.out.println("\t\t\t1.Realizar Reserva");
            System.out.println();
            System.out.println("\t\t\t2.Cancelar Reserva");
            System.out.println();
            System.out.println("\t\t\t3.Ver Reserva");
            System.out.println();
            System.out.println("\t\t\t4.Añadir habitacion");
            System.out.println();
            System.out.println("\t\t\t5.Habilitar o deshabilitar habitacion");
            System.out.println();
            System.out.println("\t\t\t6.Cerrar");
            System.out.println("----------------------------------------");

            int opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    opciones.reserva();
                    break;

                case 2:
                    opciones.cancelar_reserva();
                    break;

                case 3:
                    opciones.ver_reservar();
                    break;

                case 4:
                    opciones.añadir_habitacion();
                    break;

                case 5:
                    opciones.des_hab_habitacion();
                case 6:
                    repite = false;
                    System.out.println("\t\t\tQue tengas un buen dia :D");
                    break;
            }

        }

    }

}

