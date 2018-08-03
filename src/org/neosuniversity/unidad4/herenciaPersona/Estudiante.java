package org.neosuniversity.unidad4.herenciaPersona;

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

    public void addCourseGrade(String curso, int calificacion) {
        cursos[numeroCursos] = curso;
        calificaciones[numeroCursos] = calificacion;
        ++numeroCursos;
    }


    public void imprimirCalificaciones() {
        System.out.print(this);
        for (int i = 0; i < numeroCursos; ++i) {
            System.out.print(" " + cursos[i] + ":" + calificaciones[i]);
        }
        System.out.println();
    }

    public double getPromedioCalificaciones() {
        int sum = 0;
        for (int i = 0; i < numeroCursos; i++ ) {
            sum += calificaciones[i];
        }
        return (double)sum/numeroCursos;
    }

}
