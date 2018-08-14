package org.neosuniversity.unidad3.polimorfismoFigura;

public class Figura {

    private String color;

    public Figura (String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura[color=" + color + "]";
    }

    public double getArea() {
        System.err.println("No se puede obtener el area de una figura no definida!");
        return 0;
    }
}
