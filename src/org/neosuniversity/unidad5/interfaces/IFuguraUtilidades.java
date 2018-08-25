package org.neosuniversity.unidad5.interfaces;

public interface IFuguraUtilidades {

    static double redondeaValor(double valor){
        return Double.valueOf(String.format("%.3f", valor));
    }
}
