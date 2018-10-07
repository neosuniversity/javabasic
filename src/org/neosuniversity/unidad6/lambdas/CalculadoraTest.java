package org.neosuniversity.unidad6.lambdas;

import java.util.Optional;

/**
 * @author Hugo Hidalgo
 *         15/06/2018
 */
public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora(5, 5, "+");
        Calculadora calculadora2= new Calculadora(5, 5, "*");
        Calculadora calculadora3= new Calculadora(30, 5, "/");

        calculadora1 = CalculadoraTest.execute(calculadora1,calculadora -> {
            calculadora.setResultado(calculadora.getOperadorA() + calculadora.getOperadorB());
           return calculadora;
        });

        calculadora2 = CalculadoraTest.executeOperation(calculadora2);
        calculadora3 = CalculadoraTest.executeOperation(calculadora3);

        System.out.println(calculadora1.getResultado());
        System.out.println(calculadora2.getResultado());
        System.out.println(calculadora3.getResultado());

    }

    private static Calculadora execute(Calculadora calculadora, IOperacion operacion){
        return operacion.calcula(calculadora);
    }

    private static Calculadora executeOperation(Calculadora calculadora) {
        switch (calculadora.getOperacion()) {
            case "+": {
                calculadora =  execute(calculadora,operacion -> {
                    operacion.setResultado(operacion.getOperadorA() + operacion.getOperadorB());
                    return operacion;
                });

                break;
            }
            case "-": {
                calculadora = execute(calculadora,operacion -> {
                    operacion.setResultado(operacion.getOperadorA() - operacion.getOperadorB());
                    return operacion;
                });
                break;
            }
            case "*": {
                calculadora = execute(calculadora,operacion -> {
                    operacion.setResultado(operacion.getOperadorA() * operacion.getOperadorB());
                    return operacion;
                });
                break;
            }
            case "/": {
                calculadora = execute(calculadora,operacion -> {
                    operacion.setResultado(operacion.getOperadorA() / operacion.getOperadorB());
                    return operacion;
                });
                break;
            }
            default: {
                calculadora.setResultado(0);
                calculadora.setOperacion("::NOT FOUND::");
                break;
            }
        }
        return calculadora;
    }
}
