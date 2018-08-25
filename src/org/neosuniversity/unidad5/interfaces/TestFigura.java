package org.neosuniversity.unidad5.interfaces;


public class TestFigura {

    public static void main(String[] args) {
        Rectangulo figura1 = new Rectangulo("rojo", 4, 5);
        System.out.println(figura1);
        System.out.println("El Area es: " + figura1.getArea());
        System.out.println("Tipo de figura: " + figura1.getInformacionFigura("Rectangulo"));
        System.out.println("-----------------------------------");

        Triangulo figura2 = new Triangulo("azul", 4, 5);
        System.out.println(figura2);
        System.out.println("El Area es:  " + figura2.getArea());
        System.out.println("Tipo de figura: " + figura1.getInformacionFigura("Triangulo"));
        System.out.println("-----------------------------------");

        Circulo figura3 = new Circulo("naranja", 3);
        System.out.println(figura3);
        System.out.println("El Area es:  " + figura3.getArea());
        System.out.println("Tipo de figura: " + figura3.getInformacionFigura("Circulo"));
        System.out.println("-----------------------------------");

        Cuboide figura4 = new Cuboide("rojo", 4, 5,3);
        System.out.println(figura4);
        System.out.println("El Volumen es:  " + figura4.getVolumen());
        System.out.println("Tipo de figura: " + figura4.getInformacionFigura("Cuboide"));
        System.out.println("-----------------------------------");

        Cono figura5 = new Cono("naranja", 3, 5);
        System.out.println(figura5);
        System.out.println("El Volumen es:  " + figura5.getVolumen());
        System.out.println("Tipo de figura: " + figura5.getInformacionFigura("Cono"));
        System.out.println("-----------------------------------");

        Piramide figura6 = new Piramide("azul", 4, 5,5);
        System.out.println(figura6);
        System.out.println("El Volumen es:  " + figura6.getVolumen());
        System.out.println("Tipo de figura: " + figura6.getInformacionFigura("Piramide"));
        System.out.println("-----------------------------------");
    }
}
