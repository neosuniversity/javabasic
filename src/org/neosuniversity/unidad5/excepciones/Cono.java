package org.neosuniversity.unidad5.excepciones;

public class Cono extends Circulo implements IFiguraSolida,IFiguraUtilidades {

    private int altura;

    public Cono(String color, double radio,int altura ) {
        super(color, radio);
        this.altura=altura;
    }

    @Override
    public double getVolumen() throws FiguraException {
        validaDatos();
        return IFiguraUtilidades.redondeaValor((super.getArea()*altura) /3);
    }

    @Override
    public void validaDatos() throws FiguraException {
        if( this.radio<=0 || this.altura<=0 || this.color==null){
            throw new FiguraException("El radio, altura no puede ser cero o el color = null");
        }
    }

    @Override
    public String toString() {
        return "Cono[radio=" + radio +  ","  +"altura=" + altura +  ","+ "[color=" + color + "]";
    }

    @Override
    public String getInformacionFigura(Class<?> clazz, int index) {
        return super.getInformacionFigura(clazz,index);

    }
}
