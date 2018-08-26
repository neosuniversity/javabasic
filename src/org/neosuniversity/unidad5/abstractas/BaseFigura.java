package org.neosuniversity.unidad5.abstractas;

public abstract class BaseFigura {

    protected int base;
    protected int altura;
    protected String color;
    protected double radio;


    public BaseFigura(String color, int base, int altura) {
        this.color=color;
        this.base = base;
        this.altura = altura;
    }

    public BaseFigura(String color, double radio) {
        this.color=color;
        this.radio = radio;
    }

    public double redondeaValor(double valor){
        return Double.valueOf(String.format("%.3f", valor));
    }
}
