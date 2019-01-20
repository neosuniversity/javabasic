package org.neosuniversity.unidad6.optional;

import java.util.Optional;

/**
 * @author Hugo Hidalgo
 *         15/06/2018
 */
public class CalculadoraOptinalTest {

    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora(5, 5, "+ ");
        Calculadora calculadora2= new Calculadora(5, 5, " * ");
        Calculadora calculadora3= null;

        calculadora1 =  CalculadoraOptinalTest.executeOperationWithValidation(calculadora1);
        calculadora2 =  CalculadoraOptinalTest.executeOperationWithValidation(calculadora2);
        //calculadora3 =  CalculadoraOptinalTest.executeOperation(calculadora3);
        calculadora3 =  CalculadoraOptinalTest.executeOperationWithValidation(calculadora3);


        System.out.println(calculadora1.getResultado()  +  " operacion: " + calculadora1.getOperacion());
        System.out.println(calculadora2.getResultado()  +  " operacion: " + calculadora2.getOperacion());
        System.out.println(calculadora3.getResultado()  +  " operacion: " + calculadora3.getOperacion());

    }


    private static Calculadora executeOperationWithValidation(Calculadora calculadora){
        return  Optional
                .ofNullable(calculadora)
                .map(CalculadoraOptinalTest::executeStringTrim)
                .map(CalculadoraOptinalTest::executeOperation)
                .orElse(new Calculadora(0,0,"NOT-FOUND"));
    }

    private static Calculadora executeStringTrim(Calculadora calculadora){
        calculadora.setOperacion(calculadora.getOperacion().trim());
        return calculadora;
    }

    private static Calculadora execute(Calculadora calculadora, IOperacion operacion){
        return operacion.calcula(calculadora);
    }

    private static Calculadora executeOperation(Calculadora calculadora) {
        switch (calculadora.getOperacion()) {
            case "+": {
                execute(calculadora,operacion -> {
                    operacion.setResultado(operacion.getOperadorA() + operacion.getOperadorB());
                    return operacion;
                });

                break;
            }
            case "-": {
                execute(calculadora,operacion -> {
                    operacion.setResultado(operacion.getOperadorA() - operacion.getOperadorB());
                    return operacion;
                });
                break;
            }
            case "*": {
                execute(calculadora,operacion -> {
                    operacion.setResultado(operacion.getOperadorA() * operacion.getOperadorB());
                    return operacion;
                });
                break;
            }
            case "/": {
                execute(calculadora,operacion -> {
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
