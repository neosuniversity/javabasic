package org.neosuniversity.unidad5.abstractas;

public class Piramide extends FiguraSolida{

    protected  int  profundidad;

    public Piramide(String color, int base, int altura, int profundidad) {
        super(color, base, altura);
        this.profundidad=profundidad;
    }

    @Override
    public String toString() {
        return "Piramede[base=" + base + ",altura=" + altura + "," +"profundidad="+this.profundidad+"[color=" + color + "]";
    }
    @Override
    public double getVolumen() {
        return redondeaValor((super.base*super.altura*this.profundidad)/new Double(6));
    }


    @Override
    public String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura solida: " + clazz.getName().substring(index);
    }
}
