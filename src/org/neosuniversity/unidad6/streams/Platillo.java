package org.neosuniversity.unidad6.streams;

public class Platillo {

    private String nombre;
    private boolean vegetariano;
    private int calorias;
    private String tipo;

    public Platillo(String nombre, boolean vegetariano, int calorias, String tipo) {
        this.nombre = nombre;
        this.vegetariano = vegetariano;
        this.calorias = calorias;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
