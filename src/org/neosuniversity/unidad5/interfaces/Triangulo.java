package org.neosuniversity.unidad5.interfaces;

public class Triangulo extends BaseFigura implements IFiguraPlana,IFiguraUtilidades {

    public Triangulo(String color, int base, int altura) {
        super(color, base, altura);
    }

    @Override
    public String toString() {
        return "Triangulo[base=" + base + ",altura=" + altura + "," + "[color=" + color + "]";
    }

    @Override
    public double getArea() {
        return IFiguraUtilidades.redondeaValor(base*altura)/2;
    }
}
