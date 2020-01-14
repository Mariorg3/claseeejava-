package matrices;

public class ejercicioCinco {

	public static void main(String[] args) {
		int matrizDos[][] = { { 1, 1, 1 }, { 2, 3, 4, 5, 6, 7 }, { 2, 3, 7, 8, 9 } };
		for (int i = 0; i < matrizDos.length; i++) {
			for (int j = 0; j < matrizDos[i].length; j++) {
				System.out.println("la longitud del vector "+i+" es "+matrizDos[i].length);
				matrizDos[i][j]=i*3;
			}
		}
		EjemploTres.recorrermatriz(matrizDos);
	}

}
