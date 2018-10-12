package org.neosuniversity.unidad3.polimorfismo;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo[radio=" + radio + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }


}
