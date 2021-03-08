import java.util.ArrayList;

public class habitacion {

    public static ArrayList<habitacion> habitaciones = new ArrayList<>();
    private int NumHabitacion;
    private String Tipo;
    private int precio;
    private boolean estado;


    public habitacion(int ID_habitacion, String Tipo, int precio, boolean estado) {

        this.NumHabitacion = ID_habitacion;
        this.Tipo = Tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public boolean getEstado() {

        return estado;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
    }

    public int getNumHabitacion() {

        return NumHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {

        this.NumHabitacion = numHabitacion;
    }

    public String getTipo() {

        return Tipo;
    }

    public void setTipo(String tipo) {

        this.Tipo = tipo;
    }

    public int getPrecio() {

        return precio;
    }

    public void setPrecio(int precio) {

        this.precio = precio;
    }

    @Override
    public String toString() {

        return NumHabitacion + " " + Tipo + " " + precio + " " + estado;
    }
}
