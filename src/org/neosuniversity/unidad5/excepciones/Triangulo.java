package org.neosuniversity.unidad5.excepciones;

public class Triangulo extends BaseFigura implements IFiguraPlana,IFiguraUtilidades {

    public Triangulo(String color, int base, int altura) {
        super(color, base, altura);
    }

    @Override
    public String toString() {
        return "Triangulo[base=" + base + ",altura=" + altura + "," + "[color=" + color + "]";
    }

    @Override
    public double getArea() throws FiguraException {
        validaDatos();
        return IFiguraUtilidades.redondeaValor(base*altura)/2;
    }

    @Override
    public void validaDatos() throws FiguraException {
        if( this.base<=0 || this.altura<=0 || this.color==null){
            throw new FiguraException("La base,altura no pueden ser cero o el color = null");
        }
    }
}
