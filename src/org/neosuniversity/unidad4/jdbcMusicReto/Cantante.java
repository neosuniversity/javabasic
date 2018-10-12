package org.neosuniversity.unidad4.jdbcMusicReto;

/**
 * Created by camus on 02/06/2018.
 */
public class Cantante {

    private String nombreCantante;
    private int edad;
    private String direccion;

    public Cantante(){}

    public Cantante(String nombreCantante){
        this.nombreCantante=nombreCantante;
    }

    public Cantante(String nombreCantante, int edad){
        this.nombreCantante=nombreCantante;
        this.edad=edad;
    }

    public Cantante(String nombreCantante, int edad, String direccion){
        this.nombreCantante=nombreCantante;
        this.edad=edad;
        this.direccion=direccion;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
