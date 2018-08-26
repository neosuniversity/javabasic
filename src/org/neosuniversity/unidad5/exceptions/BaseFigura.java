package org.neosuniversity.unidad5.exceptions;

public class BaseFigura {

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
}
