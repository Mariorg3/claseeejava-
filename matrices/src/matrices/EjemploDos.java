package matrices;


public class EjemploDos {
	public static void main(String[] args) {
		// declaracion y creacion en este caso van juntos
		// int matriz[][] ;
		// matriz= { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int matriz[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		// para pintarla
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				// System.out.print(matriz[i][j] + " ");
			}
			// System.out.println();
		}

		// la matiz es desigual
		int matrizDos[][] = { { 1, 1, 1 }, { 2, 3, 4, 5, 6, 7 }, { 2, 3, 7, 8, 9 } };
		for (int i = 0; i < matrizDos.length; i++) {
			for (int j = 0; j < matrizDos[i].length; j++) {
				System.out.print(matrizDos[i][j] + " ");
			}
			System.out.println();
		}
	}
}
