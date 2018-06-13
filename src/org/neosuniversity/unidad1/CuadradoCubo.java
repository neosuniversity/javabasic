package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class CuadradoCubo {

	public static void main(String[] args) {
		
		int i=-1;
		System.out.println("Numero   | Cuadrado   | Cubo");
		while(i<=100) {
			System.out.println(i+ "           "+ Math.pow(i, 2) +"          "+ Math.pow(i, 3));
			i++;
		}
		
	}

}
