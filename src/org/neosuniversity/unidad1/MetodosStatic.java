package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class MetodosStatic {
	public static void main(String[] args) {
		int opcion = 1;
		// int opcion=2;
		//int opcion=3;
		//int opcion=4;
		float promedio=0;
		int valores[] = new int[args.length];
		for (int indice = 0; indice < args.length; indice++) {
			valores[indice] = Integer.parseInt(args[indice]);
		}

		imprimeArray(valores);

		switch (opcion) {
		case 1: {
			imprimeArray(burbujaAsc(valores));
			System.out.println("Promedio: "+ calculaPromedio(valores));
			break;
		}
		case 2: {
			imprimeArray(burbujaDesc(valores));
			System.out.println("Promedio: "+ calculaPromedio(valores));
			break;
		}
		case 3: {
			imprimeArray(valores);
			System.out.println("Promedio: "+ calculaPromedio(valores));
			break;
		}
		default :
			System.out.println("Opción no valida");
		}
		
		

	}
	/**
	 * imprime el array de tamano n
	 * @param array
	 */
	public static void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i] + ",");
			} else {
				if (i < array.length)
					System.out.print(array[i]);
				if (i != array.length - 1)
					System.out.print(",");
				else
					System.out.println("]");
			}
		}
	}
	/**
	 * ordena un array de forma Ascendente usando el metodo <br>
	 * de la burbuja
	 * @param array elementos del array
	 * @return array ordenado
	 */
	public static int[] burbujaAsc(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}
	/**
	 * ordena un array de forma Descendente usando el metodo <br>
	 * de la burbuja
	 * @param array elementos del array
	 * @return array ordenado
	 */
	public static int[] burbujaDesc(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					int tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}
	/**
	 * Calcula el promedio de un array de tamano n
	 * @param array contiene los elementos
	 * @return promedio
	 */
	public static float calculaPromedio(int[] array) {
		float suma=0;
		for(int i=0;i<array.length;i++)
			suma+=array[i];
		
		return suma/array.length;
	}

}
