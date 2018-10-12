package org.neosuniversity.unidad2.calculadora;

/**
 * Created by camus on 05/06/2018.
 */
public class Calculadora {


    private double operadorA;
    private double operadorB;
    private String operacion;
    private double resultado;

    public Calculadora() {}

    public Calculadora(double operadorA, double operadorB) {
        this.operadorA = operadorA;
        this.operadorB = operadorB;
    }

    public Calculadora(double operadorA, double operadorB,String operacion) {
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

    private  double suma(Calculadora calculadora){
        double opeardorA = calculadora.getOperadorA();
        double opeardorB = calculadora.getOperadorB();

        return (opeardorA + opeardorB);
    }

    private  double resta(Calculadora calculadora){
        double opeardorA = calculadora.getOperadorA();
        double opeardorB =calculadora.getOperadorB();

        return (opeardorA - opeardorB);
    }

    private  double multiplicacion(Calculadora calculadora){
        double opeardorA = (calculadora.getOperadorA());
        double opeardorB = (calculadora.getOperadorB());

        return (opeardorA * opeardorB);
    }

    private  double divison(Calculadora calculadora){
        double opeardorA = (calculadora.getOperadorA());
        double opeardorB = (calculadora.getOperadorB());

        return (opeardorA / opeardorB);
    }

    public void executeOperation(Calculadora calculadora){
        switch (calculadora.getOperacion()){
            case "+":{
                calculadora.setResultado(suma(calculadora));
                break;
            }
            case "-":{
                calculadora.setResultado(resta(calculadora));
                break;
            }
            case "*":{
                calculadora.setResultado(multiplicacion(calculadora));
                break;
            }
            case "/":{
                calculadora.setResultado(divison(calculadora));
                break;
            }
            default:{
                // calculadora.setResultado("ERROR");
                break;
            }
        }
    }

}
