package org.neosuniversity.unidad5.interfaces;

public class Cono extends Circulo implements IFiguraSolida {

    private int altura;

    public Cono(String color, double radio, int altura) {
        super(color, radio);
        this.altura=altura;
    }

    @Override
    public String getInformacionFigura(String tipoFigura){
        return "Es una figura solida: " + tipoFigura;
    }

    @Override
    public String toString() {
        return "Cono[radio=" + radio +  ","  +"altura=" + altura +  ","+ "[color=" + color + "]";
    }
    @Override
    public double getVolumen() {
        return (super.getArea()*altura) /3;
    }
}
