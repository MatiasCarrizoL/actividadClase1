package clasesEntidad;

public class Materia {
    private String nombre;
    private int anio;
    private int nota;

    public Materia(String nombre, int anio, int nota) {
        this.nombre = nombre;
        this.anio = anio;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
