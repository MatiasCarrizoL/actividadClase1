package clasesEntidad;

import java.util.Scanner;

public class Inscripcion {

    private Materia materia;
    private Alumno alumno;

    public Inscripcion(Materia materia, Alumno alumno) {
        this.materia = materia;
        this.alumno = alumno;
    }



    public static boolean aprobada(Materia mat){
        return mat.getNota()>=6;
    }
}
