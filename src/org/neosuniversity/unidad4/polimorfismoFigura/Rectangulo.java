package org.neosuniversity.unidad4.polimorfismoFigura;

public class Rectangulo extends Figura {

    private int base;
    private int altura;


    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo[base=" + base + ",altura=" + altura + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return base*altura;
    }
}
