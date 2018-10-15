package org.neosuniversity.unidad5.excepciones;

public interface IFiguraUtilidades {

    static double redondeaValor(double valor){
        return Double.valueOf(String.format("%.3f", valor));
    }
}
