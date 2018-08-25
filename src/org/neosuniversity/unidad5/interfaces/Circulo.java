package org.neosuniversity.unidad5.interfaces;

public class Circulo implements IFiguraPlana,IFuguraUtilidades{

    protected double radio;
    protected String color;

    public Circulo(String color, double radio) {
        this.color=color;
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return IFuguraUtilidades.redondeaValor(Math.PI*Math.pow(radio,2));
    }

    @Override
    public String toString() {
        return "Circulo[radio=" + radio +  "," + "[color=" + color + "]";
    }
}
