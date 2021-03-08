import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class reserva {

    public static ArrayList<reserva> Reservas = new ArrayList<>();
    private final SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");
    private Date fecha_entrada;
    private Date fecha_salida;
    private int Num_Habitacion;
    private String Num_Usuario;
    private int codReserva;


    public reserva(Date fech_entrada, Date fecha_salida, int id_habitacion, String nombre, int codReserva) {

        this.fecha_entrada = fech_entrada;
        this.fecha_salida = fecha_salida;
        this.Num_Habitacion = id_habitacion;
        this.codReserva = codReserva;
        this.Num_Usuario = nombre;
    }


    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFech_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getNum_Habitacion() {
        return Num_Habitacion;
    }

    public void setNum_Habitacion(int num_Habitacion) {
        Num_Habitacion = num_Habitacion;
    }

    public String getNum_Usuario() {
        return Num_Usuario;
    }

    public void setNum_Usuario(String num_Usuario) {
        this.Num_Usuario = num_Usuario;
    }

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    @Override
    public String toString() {
        return formato.format(fecha_entrada) + " " + formato.format(fecha_salida) + " " + Num_Habitacion + " " + Num_Usuario + " " + codReserva;
    }
}

