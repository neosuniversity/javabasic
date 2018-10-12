package org.neosuniversity.unidad3.herencia;

public class Estudiante extends Persona {


    private int numeroCursos;
    private String[] cursos;
    private int[] calificaciones;
    private static final int MAX_CURSOS = 30;


    public Estudiante(String nombre, String direccion) {
        super(nombre, direccion);
        numeroCursos = 0;
        cursos = new String[MAX_CURSOS];
        calificaciones = new int[MAX_CURSOS];
    }


    @Override
    public String toString() {
        return "Estudiante: " + super.toString();
    }

    public void agregarCursoCalificacion(String curso, int calificacion) {
        cursos[numeroCursos] = curso;
        calificaciones[numeroCursos] = calificacion;
        ++numeroCursos;
    }


    public void imprimirCalificaciones() {
        System.out.println(this);
        for (int i = 0; i < numeroCursos; ++i) {
            System.out.println(" " + cursos[i] + ":" + calificaciones[i]);
        }
    }

    public double getPromedioCalificaciones() {
        int sum = 0;
        for (int i = 0; i < numeroCursos; i++ ) {
            sum += calificaciones[i];
        }
        return (double)sum/numeroCursos;
    }

}
