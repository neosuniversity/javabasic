package org.neosuniversity.unidad5.interfaces;

public class Cuboide extends Rectangulo implements IFiguraSolida {

    private int profundidad;

    public Cuboide(String color, int base, int altura, int profundidad) {
        super(color, base, altura);
        this.profundidad=profundidad;
    }

    @Override
    public String getInformacionFigura(String tipoFigura){
        return "Es una figura solida: " + tipoFigura;
    }

    @Override
    public String toString() {
        return "Cubiode[base=" + base + ",altura=" + altura + "," +"[color=" + color + "]";
    }

    @Override
    public double getVolumen() {
        return getArea()*profundidad;
    }
}
