package org.neosuniversity.unidad5.interfaces;

public class Cuboide extends Rectangulo implements IFiguraSolida {

    private int profundidad;

    public Cuboide(String color, int base, int altura, int profundidad) {
        super(color, base, altura);
        this.profundidad=profundidad;
    }

    @Override
    public String toString() {
        return "Cubiode[base=" + base + ",altura=" + altura + "," +"[color=" + color + "]";
    }

    @Override
    public double getVolumen() {
        return getArea()*profundidad;
    }

    @Override
    public String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura solida: " + clazz.getName().substring(index);
    }
}
