package matrices;

public class EjemploTres {
	public static void main(String[] args) {
		int matrizDos[][] = { { 1, 1, 1 }, { 2, 3, 4, 5, 6, 7 }, { 2, 3, 7, 8, 9 } };
		int[] vector = { 8, 8, 8, 8, 8, 8, 8 }, vectorDos;
		// el nombre de la matriz hace referencia a toda la matriz
		vectorDos = matrizDos[1];
		vectorDos[0] = 99;
		// Los vectores no se copian solo se referencian
		// Si quereis copiar un vector hay que clonarlo
		recorrevector(vectorDos);
		recorrevector(matrizDos[1]);
		// La diferencia si se clona un vector
		vectorDos = clonarVector(matrizDos[1]);
		vectorDos[0] = 88;
		recorrevector(vectorDos);
		recorrevector(matrizDos[1]);
		matrizDos[0] = vector;
		recorrermatriz(matrizDos);

	}

	public static void recorrermatriz(int[][] matrizDos) {
		System.out.println();
		for (int i = 0; i < matrizDos.length; i++) {
			recorrevector(matrizDos[i]);
		}
	}
	public static void recorrevector(int[] vectorDos) {
		System.out.println();
		for (int i = 0; i < vectorDos.length; i++) {
			System.out.print(vectorDos[i] + " ");
		}
		System.out.println();
	}
	public static int[] clonarVector(int[] original) {
		int[] clon = new int[original.length];
		for (int i = 0; i < clon.length; i++) {
			clon[i] = original[i];
		}
		return clon;
	}
}
