package org.neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class ArraysReto {
	public static void main(String[] args) {
		int opcion=1;
		//int opcion=2;
		
		int[] valores = { 45, 9, 1, 6, -2 };
		for (int i = 0; i < valores.length; i++) {
			if (i == 0) {
				System.out.print("[" + valores[i] + ",");
			} else {
				if (i < valores.length)
					System.out.print(valores[i]);
				if (i != valores.length - 1)
					System.out.print(",");
				else
					System.out.print("]");
			}
		}
		System.out.println("");
		
		switch (opcion) {
		case 1: {
			for (int i = 0; i < valores.length - 1; i++) {
				for (int j = 0; j < valores.length - 1; j++) {
					if (valores[j] > valores[j + 1]) {
						int tmp = valores[j + 1];
						valores[j + 1] = valores[j];
						valores[j] = tmp;
					}
				}
			}
			break;
		}
		case 2:{
			for (int i = 0; i < valores.length - 1; i++) {
				for (int j = 0; j < valores.length - 1; j++) {
					if (valores[j] < valores[j + 1]) {
						int tmp = valores[j + 1];
						valores[j + 1] = valores[j];
						valores[j] = tmp;
					}
				}
			}
			break;
		}
		}
		
		for (int i = 0; i < valores.length; i++) {
			if (i == 0) {
				System.out.print("[" + valores[i] + ",");
			} else {
				if (i < valores.length)
					System.out.print(valores[i]);
				if (i != valores.length - 1)
					System.out.print(",");
				else
					System.out.print("]");
			}

		}

	}

	public static int[] metodoBurbujaAsc(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					int tmp = num[j + 1];
					num[j + 1] = num[j];
					num[j] = tmp;
				}
			}
		}

		return num;
	}

}
