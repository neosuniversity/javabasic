package org.neosuniversity.unidad2.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class CalculadoraController {

    @FXML
    private TextField txtOperadorA;

    @FXML
    private TextField txtOperadorB;

    @FXML
    private TextField txtResultado;

    @FXML
    private TextArea txtOperacion;

    private Calculadora calculadora;


    public void actionSuma(ActionEvent event){
        ejectutaOperacion("+",Alert.AlertType.INFORMATION);
    }

    public void actionResta(ActionEvent event){
        ejectutaOperacion("-",Alert.AlertType.ERROR);
    }

    public void actionMultiplicacion(ActionEvent event){
        ejectutaOperacion("*",Alert.AlertType.WARNING);
    }

    public void actionDivision(ActionEvent event){
        ejectutaOperacion("/",Alert.AlertType.CONFIRMATION);
    }

    public void actionlimpiar(ActionEvent event){
        txtOperadorA.clear();
        txtOperadorB.clear();
        txtResultado.clear();
        txtOperacion.clear();
    }

    private void ejectutaOperacion(String operador,Alert.AlertType value){
        if(validaOperadores(txtOperadorA.getText(), txtOperadorB.getText())){
            enviaMensajeError(value);
        }else {
            System.out.println("valor" + txtOperadorA.getText() + operador + txtOperadorB.getText());
            txtOperacion.setText(txtOperadorA.getText() + operador + txtOperadorB.getText());
            calculadora = ejecutaOparacion(txtOperadorA.getText(), txtOperadorB.getText(), operador);

            txtResultado.setText(String.valueOf(calculadora.getResultado()));
        }
    }

    private Calculadora ejecutaOparacion(String operadorA, String operadorB,String operador){
        Calculadora calculadora = new Calculadora(Double.valueOf(operadorA),Double.valueOf(operadorB),operador);
        calculadora.executeOperation(calculadora);
        return calculadora;
    }

    private boolean validaOperadores(String operadorA, String OperadorB){
        boolean bandera=false;
        if(operadorA!=null && OperadorB!=null){
            if(operadorA.isEmpty()|| OperadorB.isEmpty()){
                bandera=true;
            }
        }
        return bandera;
    }

    private void enviaMensajeError(Alert.AlertType value){
        Alert alerta = new Alert(value);
        alerta.setTitle("Error en operandos");
        alerta.setHeaderText("***Favor de verificar los operadores ***");
        alerta.show();
    }

}
