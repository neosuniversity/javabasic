package org.neosuniversity.unidad3.part2;

/**
 * Created by camus on 02/06/2018.
 */
public class Cancion implements Comparable<Cancion>{

    private String nombreCancion;
    private float duracion;

    public Cancion(){
    }

    public Cancion(String nombreCancion,float duracion){
        this.nombreCancion=nombreCancion;
        this.duracion=duracion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public int compareTo(Cancion o) {
        return this.getNombreCancion().toUpperCase().compareTo(o.getNombreCancion().toUpperCase());
    }
}
