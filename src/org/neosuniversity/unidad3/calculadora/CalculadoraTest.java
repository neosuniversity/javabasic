package org.neosuniversity.unidad3.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("calculadora.fxml"));
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(new Scene(root, 350, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
