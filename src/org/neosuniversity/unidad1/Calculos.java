package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class Calculos {

	public static void main(String[] args) {
		double radio=5;
		double diametro=2*radio;
		double circunferencia= 2*Math.PI*radio;
		double area=Math.PI*(Math.pow(radio, 2));
		
		System.out.println("diametro="+diametro+ " circunferencia="+circunferencia+" area="+area);
		

	}

}
