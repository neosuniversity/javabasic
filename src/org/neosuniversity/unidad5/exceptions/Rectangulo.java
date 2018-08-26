package org.neosuniversity.unidad5.exceptions;

public class Rectangulo extends BaseFigura implements IFiguraPlana {

    public Rectangulo(String color, int base, int altura) {
        super(color, base, altura);
    }

    @Override
    public String toString() {
        return "Rectangulo[base=" + base + ",altura=" + altura + "," +"[color=" + color + "]";
    }


    @Override
    public double getArea() throws FiguraException {
        validaDatos();
        return base*altura;
    }

    @Override
    public void validaDatos() throws FiguraException {
        if( this.altura<=0 || this.base<=0 || this.color==null){
            throw new FiguraException("La base,altura no pueden ser cero o el color = null");
        }
    }

}
