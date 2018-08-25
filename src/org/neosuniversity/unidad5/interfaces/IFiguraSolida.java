package org.neosuniversity.unidad5.interfaces;

public interface IFiguraSolida {

    double getVolumen();

    default String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura solida: " + clazz.getName().substring(index);
    }
}
