package org.neosuniversity.unidad5.interfaces;

public class Cono extends Circulo implements IFiguraSolida,IFiguraUtilidades {

    private int altura;

    public Cono(String color, double radio,int altura ) {
        super(color, radio);
        this.altura=altura;
    }

    @Override
    public double getVolumen() {
        return IFiguraUtilidades.redondeaValor((super.getArea()*altura) /3);
    }


    @Override
    public String toString() {
        return "Cono[radio=" + radio +  ","  +"altura=" + altura +  ","+ "[color=" + color + "]";
    }

    @Override
    public String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura solida: " + clazz.getName().substring(index);

    }
}
