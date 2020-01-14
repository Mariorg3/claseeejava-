package matrices;


public class EjemploCuatro {
public static void main(String[] args) {
	int matriz[][] = new int[5][4];
	int min=1,max=9;
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			matriz[i][j]=generaNumeroAleatorio(min, max);
		}
	}
	EjemploTres.recorrermatriz(matriz);
}
public static int generaNumeroAleatorio(int min, int max) {
	return (int) (Math.random() * (max - min + 1)) + min;
}

}
