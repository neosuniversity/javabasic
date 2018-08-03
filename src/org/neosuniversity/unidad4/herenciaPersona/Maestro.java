package org.neosuniversity.unidad4.herenciaPersona;

public class Maestro extends Persona {


    private int numCursos;
    private String[] cursos;
    private static final int MAX_CURSOS= 5;

    public Maestro(String name, String address) {
        super(name, address);
        numCursos = 0;
        cursos = new String[MAX_CURSOS];
    }


    @Override
    public String toString() {
        return "Maestro: " + super.toString();
    }


    public boolean agregarCurso(String course) {
        for (int i = 0; i < numCursos; i++) {
            if (cursos[i].equals(course)) return false;
        }
        cursos[numCursos] = course;
        numCursos++;
        return true;
    }


    public boolean eliminarCurso(String curso) {
        boolean encontrado = false;
        int indiceCurso = -1;
        for (int i = 0; i < numCursos; i++) {
            if (cursos[i].equals(curso)) {
                indiceCurso = i;
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            for (int i = indiceCurso; i < numCursos-1; i++) {
                cursos[i] = cursos[i+1];
            }
            numCursos--;
            return true;
        } else {
            return false;
        }
    }

}
