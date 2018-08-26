package org.neosuniversity.unidad5.abstractas;

public abstract class FiguraPlana extends BaseFigura {

    public FiguraPlana(String color, int base, int altura) {
        super(color, base, altura);
    }

    public FiguraPlana(String color, double radio) {
        super(color, radio);
    }

    public abstract double getArea();

    public String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura plana: " + clazz.getName().substring(index);
    }


}
