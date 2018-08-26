package org.neosuniversity.unidad5.abstractas;


public class Triangulo extends FiguraPlana {

    public Triangulo(String color, int base, int altura) {
        super(color, base, altura);
    }

    @Override
    public String toString() {
        return "Triangulo[base=" + base + ",altura=" + altura + "," + "[color=" + color + "]";
    }

    @Override
    public double getArea() {
        return super.redondeaValor(base*altura)/2;
    }
}
