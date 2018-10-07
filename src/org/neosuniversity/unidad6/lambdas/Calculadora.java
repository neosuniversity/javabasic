package org.neosuniversity.unidad6.lambdas;

/**
 * @author Hugo Hidalgo
 *         15/06/2018
 */
public class Calculadora {

    private double operadorA;
    private double operadorB;
    private String operacion;
    private double resultado;

    public Calculadora() {
    }

    public Calculadora(double operadorA, double operadorB) {
        this.operadorA = operadorA;
        this.operadorB = operadorB;
    }

    public Calculadora(double operadorA, double operadorB, String operacion) {
        this.operadorA = operadorA;
        this.operadorB = operadorB;
        this.operacion = operacion;
    }

    public double getOperadorA() {
        return operadorA;
    }

    public void setOperadorA(double operadorA) {
        this.operadorA = operadorA;
    }

    public double getOperadorB() {
        return operadorB;
    }

    public void setOperacorB(double operadorB) {
        this.operadorB = operadorB;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
