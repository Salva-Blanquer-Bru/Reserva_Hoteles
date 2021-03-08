public class hoteles {
    private String nombre;
    private int habitaciones, puntuacion;


    public hoteles(String nombre, int habitaciones, int puntuacion) {
        this.nombre = nombre;
        this.habitaciones = habitaciones;
        this.puntuacion = puntuacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
