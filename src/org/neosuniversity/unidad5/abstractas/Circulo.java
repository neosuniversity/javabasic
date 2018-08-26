package org.neosuniversity.unidad5.abstractas;

public class Circulo extends FiguraPlana  {


    public Circulo(String color, double radio) {
        super(color, radio);
    }

    @Override
    public double getArea() {
        return super.redondeaValor(Math.PI*Math.pow(radio,2));
    }

    @Override
    public String toString() {
        return "Circulo[radio=" + radio +  "," + "[color=" + color + "]";
    }
}
