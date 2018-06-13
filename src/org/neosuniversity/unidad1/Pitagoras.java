package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class Pitagoras {

	public static void main(String[] args) {

		for (int hipotenusa = 1; hipotenusa <= 1000; hipotenusa++) {
			for (int catetoA = 1; catetoA <= 1000; catetoA++) {
				for (int catetoB = 1; catetoB <= 1000; catetoB++) {
					if (Math.pow(hipotenusa, 2) == (Math.pow(catetoA, 2) + Math.pow(catetoB, 2))) {
						System.out.println("Triples Pitagoras: " + hipotenusa + "^2 = (" + catetoA + ")^2+(" + catetoB + ")^2");
					}
				}
			}
		}

	}

}
