package org.neosuniversity.unidad2.math;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {

    }

    public Fraccion(int num) {
        numerador = num;
        denominador = 1;
    }

    public Fraccion(int num, int den) {
        numerador = num;
        denominador = den;
    }

    public Fraccion suma(Fraccion fraccion) {
        Fraccion tmp = new Fraccion();
        tmp.setNumerador(numerador * fraccion.getDenominador() + denominador * fraccion.getNumerador());
        tmp.setDenominador(denominador * fraccion.getDenominador());
        return tmp;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return
                numerador +
                        "/" + denominador;

    }
}
