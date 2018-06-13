package org.neosuniversity.unidad2.math;

public class MathApplication {

    public static void main(String[] args) {
        Fraccion a = new Fraccion(1,4);
        Fraccion b = new Fraccion(1,4);

        System.out.println("c = " + a + " + " + b);

        Fraccion c = a.suma(b);

        System.out.println("c = " +  c);
    }
}
