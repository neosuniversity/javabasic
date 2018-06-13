package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class Arrays {

	public static void main(String[] args) {
		
		int[] valores= {45,9,1,6,-2};
		float suma=0;
		int positivos=0;
		int negativos=0;
		
		for(int i=0;i<valores.length;i++) {
			if(valores[i]<0) {
				positivos++;
			}
			if(valores[i]>0) {
				negativos++;
			}
			suma+=valores[i];
		}
		System.out.println("Promedio: "+suma /valores.length );
		System.out.println("Positivos: "+positivos );
		System.out.println("Negativos: "+negativos );
		
 
	}

}
