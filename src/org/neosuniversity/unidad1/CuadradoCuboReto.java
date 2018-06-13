package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class CuadradoCuboReto {

	public static void main(String[] args) {
		
		int i=0;
		boolean bandera=true;
		do {
			if(i<0) {
				System.out.println("No se permite usar numeros menores a 0");
				break;
			}
			if(bandera) {
				System.out.println("Numero   | Cuadrado   | Cubo");
				bandera=false;
			}
			else {
			System.out.println(i+ "           "+ Math.pow(i, 2) +"          "+ Math.pow(i, 3));
			}
			i++;
		}while(i<=100);

	}

}
