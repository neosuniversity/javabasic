package org.neosuniversity.unidad5.interfaces;

public class Piramide extends Triangulo implements IFiguraSolida{

    protected  int  profundidad;

    public Piramide(String color, int base, int altura,int profundidad) {
        super(color, base, altura);
        this.profundidad=profundidad;
    }

    @Override
    public String getInformacionFigura(String tipoFigura){
        return "Es una figura solida: " + tipoFigura;
    }

    @Override
    public String toString() {
        return "Piramede[base=" + base + ",altura=" + altura + "," +"profundidad="+this.profundidad+"[color=" + color + "]";
    }
    @Override
    public double getVolumen() {
        return (super.getArea()*profundidad) /3;
    }
}
