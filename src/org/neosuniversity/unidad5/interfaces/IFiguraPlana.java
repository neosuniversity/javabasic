package org.neosuniversity.unidad5.interfaces;

public interface IFiguraPlana {

    double getArea();

    default String getInformacionFigura(Class<?> clazz, int index) {
        return "Es una figura plana: " + clazz.getName().substring(index);
    }


}
