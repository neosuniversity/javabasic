package org.neosuniversity.unidad3.polimorfismoFigura;

public class TestFigura {

    public static void main(String[] args) {
        Figura figura1 = new Rectangulo("rojo", 4, 5);
        System.out.println(figura1);  // Run Rectangle's toString()
        System.out.println("El Area es: " + figura1.getArea());
        System.out.println("-----------------------------------");

        Figura figura2 = new Triangulo("azul", 4, 5);
        System.out.println(figura2);
        System.out.println("El Area es:  " + figura2.getArea());
        System.out.println("-----------------------------------");

        Figura figura3 = new Circulo("naranja", 3);
        System.out.println(figura3);
        System.out.println("El Area es:  " + figura3.getArea());
        System.out.println("-----------------------------------");

        Figura figura4 = new Figura("green");
        System.out.println(figura4);
        System.out.println("Area is " + figura4.getArea());
    }
}
