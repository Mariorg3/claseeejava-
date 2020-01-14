package matrices;

public class EjemploUno {
	public static void main(String[] args) {
		// declaracion
		int matriz[][];
		// creacion
		matriz = new int[4][4];
		//recorrer para rellenar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=i;
			}
		}
		//para pintarla
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
