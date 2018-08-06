package org.neosuniversity.unidad4.jdbcMusic;



/**
 * Created by camus on 02/06/2018.
 */
public class Disco implements Comparable<Disco>{

    private String nombreDisco;
    private int annoLanzamiento;
    private Cantante cantante;
    private Cancion[] lstCanciones;
    private String genero;


    public Disco(){}

    public Disco(String nombreDisco, int annoLanzamiento, Cantante cantante, Cancion[] lstCanciones) {
        this.nombreDisco = nombreDisco;
        this.annoLanzamiento = annoLanzamiento;
        this.cantante = cantante;
        this.lstCanciones = lstCanciones;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public int getAnnoLanzamiento() {
        return annoLanzamiento;
    }

    public void setAnnoLanzamiento(int annoLanzamiento) {
        this.annoLanzamiento = annoLanzamiento;
    }

    public Cantante getCantante() {
        return cantante;
    }

    public void setCantante(Cantante cantante) {
        this.cantante = cantante;
    }

    public Cancion[] getLstCanciones() {
        return lstCanciones;
    }

    public void setLstCanciones(Cancion[] lstCanciones) {
        this.lstCanciones = lstCanciones;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Disco o) {
        return this.getNombreDisco().toUpperCase().compareTo(o.getNombreDisco().toUpperCase());
    }
}
