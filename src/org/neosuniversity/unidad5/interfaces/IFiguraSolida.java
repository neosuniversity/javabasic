package org.neosuniversity.unidad5.interfaces;

public interface IFiguraSolida {

    double getVolumen();

    default String getInformacionFigura(String tipoFigura){
        return "Es una figura solida: " + tipoFigura;
    }
}
