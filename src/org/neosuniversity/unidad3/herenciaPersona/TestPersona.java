package org.neosuniversity.unidad3.herenciaPersona;

public class TestPersona {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Hector Hugo", "Av Juarez");
        estudiante.agregarCursoCalificacion("JavaScript", 97);
        estudiante.agregarCursoCalificacion("Python", 68);
        estudiante.imprimirCalificaciones();
        System.out.println("El promedio es " + estudiante.getPromedioCalificaciones());
        System.out.println("----------------------------------------------");


        /* Test Teacher class */
        Maestro maestro = new Maestro("Mario", "Av Churubusco");
        System.out.println(maestro);
        String[] courses = {"JavaScript", "Python", "JavaScript", "Java"};
        for (String course: courses) {
            if (maestro.agregarCurso(course)) {
                System.out.println(course + " - Agregado.");
            } else {
                System.out.println(course + " - No pudo ser agregado.");
            }
        }
        System.out.println("#####################################");
        for (String course: courses) {
            if (maestro.eliminarCurso(course)) {
                System.out.println(course + " -  Eliminado.");
            } else {
                System.out.println(course + " - No pudo ser eliminado.");
            }
        }
    }
}
