import clasesEntidad.Alumno;
import clasesEntidad.Inscripcion;
import clasesEntidad.Materia;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MenuSeleccion();

        }

    public static void MenuSeleccion() {
       Alumno alu = ingresoDeDatosAlumno();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione la materia en la que desea inscribirse:\n" +
                "1- Algoritmo y Estructura de Datos \n"+
                "2- Paradigmas de Programación\n" +
                "3- Paradigmas de Diseño de Sistemas\n");
        int opc= entrada.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Felicidades " +alu.getNombre()+" "+alu.getApellido()+"," +
                        " estás inscripto en la materia Algoritmo y Estructura de Datos");
                break;
            case 2:
                System.out.println("Para inscribirse en esta materia debe tener aprobada la materia" +
                        " Algoritmo y Estructura de Datos:");
                Materia mat = ingresoDatosMateria();
                if (Inscripcion.aprobada(mat) && mat.getNombre().equals("algoritmo y estructura de datos") ){
                    System.out.println("Felicidades "+ alu.getNombre()+" "+alu.getApellido()+
                            " estás inscripto en la materia Paradigmas de Programación.");
                    break;
                } else {
                    System.out.println("La materia correlativa no coincide o tu nota es menor a 6");
                    break;
                }
            case 3:
                System.out.println("Para inscribirse en la materia Paradigmas de Diseño de Sistemas" +
                        " debe tener aprobada la materia Paradigmas de Programación:");
                Materia mat2 = ingresoDatosMateria();
                if (Inscripcion.aprobada(mat2) && mat2.getNombre().equals("paradigmas de programacion") ){
                    System.out.println("Felicidades "+ alu.getNombre()+" " +alu.getApellido()+
                            " estás inscripto en la materia Paradigmas de Diseño de Sistemas.");
                    break;
                } else {
                    System.out.println("La materia correlativa no coincide o tu nota es menor a 6");
                    break;
                }


        }
    }

    @org.jetbrains.annotations.NotNull
    public static Alumno ingresoDeDatosAlumno(){
        Scanner entrada = new Scanner(System.in);
        String nombre,apellido;

        System.out.println("Bienvenido, por favor ingrese su nombre:");
        nombre= entrada.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido= entrada.nextLine();
        System.out.println("Ingrese su DNI:");
        long DNI= entrada.nextLong();
        Alumno alu = new Alumno(nombre,apellido,DNI);
        return alu;
    }

    public static Materia ingresoDatosMateria(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia correlativa:");
        String nombre = entrada.nextLine().toLowerCase();
        System.out.println("Ingrese el año de la materia:");
        int anio = entrada.nextInt();
        int nota;
        do {
            System.out.println("Ingrese la nota de la materia:");
             nota = entrada.nextInt();
        } while (nota < 1 && nota > 10);

        Materia mat = new Materia(nombre,anio,nota);
        return mat;
    }
    }
