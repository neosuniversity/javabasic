package org.neosuniversity.unidad5.abstractas;

public abstract class FiguraSolida extends BaseFigura {

    public FiguraSolida(String color, int base, int altura) {
        super(color, base, altura);
    }

    public FiguraSolida(String color, double radio) {
        super(color, radio);
    }

    public abstract double getVolumen();

    public String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura solida: " + clazz.getName().substring(index);
    }
}
