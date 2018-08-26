package org.neosuniversity.unidad5.abstractas;


public class Rectangulo extends FiguraPlana  {

    public Rectangulo(String color, int base, int altura) {
        super(color, base, altura);
    }

    @Override
    public String toString() {
        return "Rectangulo[base=" + base + ",altura=" + altura + "," +"[color=" + color + "]";
    }

    @Override
    public double getArea() {
        return (base*altura) /2;
    }
}
