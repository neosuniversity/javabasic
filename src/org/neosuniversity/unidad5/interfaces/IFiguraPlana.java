package org.neosuniversity.unidad5.interfaces;

public interface IFiguraPlana {

    double getArea();

    default String getInformacionFigura(String tipoFigura){
        return "Es una figura plana: " + tipoFigura;
    }


}
