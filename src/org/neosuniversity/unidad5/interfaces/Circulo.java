package org.neosuniversity.unidad5.interfaces;

public class Circulo implements IFiguraPlana {

    protected double radio;
    protected String color;

    public Circulo(String color, double radio) {
        this.color=color;
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Circulo[radio=" + radio +  "," + "[color=" + color + "]";
    }
}
