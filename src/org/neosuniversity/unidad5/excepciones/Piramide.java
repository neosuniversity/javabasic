package org.neosuniversity.unidad5.excepciones;

public class Piramide extends Triangulo implements IFiguraSolida,IFiguraUtilidades {

    protected  int  profundidad;

    public Piramide(String color, int base, int altura,int profundidad) {
        super(color, base, altura);
        this.profundidad=profundidad;
    }

    @Override
    public String toString() {
        return "Piramede[base=" + base + ",altura=" + altura + "," +"profundidad="+this.profundidad+"[color=" + color + "]";
    }
    @Override
    public double getVolumen() throws FiguraException {
        validaDatos();
        return IFiguraUtilidades.redondeaValor((super.getArea()*profundidad) /3);
    }

    @Override
    public void validaDatos() throws FiguraException {
        if( this.base<=0 || this.altura<=0 || this.profundidad<=0||this.color==null){
            throw new FiguraException("La base,altura no pueden ser cero o el color = null");
        }
    }

    @Override
    public String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura solida: " + clazz.getName().substring(index);
    }
}
