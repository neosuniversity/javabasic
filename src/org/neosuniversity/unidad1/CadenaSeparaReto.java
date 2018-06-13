package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class CadenaSeparaReto {

	public static void main(String[] args) {
		//String cadena = "42339";
		String cadena = "4233";
		//String cadena = "423399";
		if(cadena.length()==5)
		System.out.println(cadena.substring(0, 1)+"-"+cadena.substring(1, 2)+"-"+cadena.substring(2, 3)+"-"+cadena.substring(3, 4)+"-"+cadena.substring(4, 5));
		else if(cadena.length()<5)
			System.out.println("El numero no puede ser menor a 4 caracteres");
		else
			System.out.println("El numero no puede ser mayor a 5 caracteres");
	}
}
