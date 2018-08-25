package org.neosuniversity.unidad5.interfaces;

public class Circulo extends BaseFigura implements IFiguraPlana,IFiguraUtilidades {


    public Circulo(String color, double radio) {
        super(color, radio);
    }

    @Override
    public double getArea() {
        return IFiguraUtilidades.redondeaValor(Math.PI*Math.pow(radio,2));
    }

    @Override
    public String toString() {
        return "Circulo[radio=" + radio +  "," + "[color=" + color + "]";
    }
}
