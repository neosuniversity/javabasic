package org.neosuniversity.unidad5.excepciones;

public class Circulo extends BaseFigura implements IFiguraPlana,IFiguraUtilidades {


    public Circulo(String color, double radio) {
        super(color, radio);
    }

    @Override
    public double getArea() throws FiguraException {
        validaDatos();
        return IFiguraUtilidades.redondeaValor(Math.PI*Math.pow(radio,2));
    }

    @Override
    public void validaDatos() throws FiguraException {
        if( this.radio<=0 || this.color==null){
            throw new FiguraException("El radio no puede ser cero o el color = null");
        }
    }

    @Override
    public String toString() {
        return "Circulo[radio=" + radio +  "," + "[color=" + color + "]";
    }
}
