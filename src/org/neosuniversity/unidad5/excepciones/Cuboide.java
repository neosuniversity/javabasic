package org.neosuniversity.unidad5.excepciones;

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
    public double getVolumen() throws FiguraException {
        validaDatos();
        return getArea()*profundidad;
    }

    @Override
    public void validaDatos() throws FiguraException {
        if( this.altura<=0 || this.base<=0  ||this.profundidad<=0|| this.color==null){
            throw new FiguraException("La base,altura, profundidad  no pueden ser cero o el color = null");
        }
    }

    @Override
    public String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura solida: " + clazz.getName().substring(index);
    }
}
