package matrices;

public class ejercccio1 {
	public static void main(String[] args) {
	int A[] [] = {{ 9, 5, 3, 6, 8, 9, 6, 5, 2, 5 }, 
		{ 9, 2, 3, 5, 8, 7, 8, 5, 9, 6 }, 
		{ 9, 5, 6, 2, 8, 5, 2, 1, 5, 2 },
		{ 10, 5, 5, 2, 8, 5, 8, 7, 4, 5 }, 
		{ 9, 6, 8, 7, 8, 5, 8, 9, 5, 7 }, 
		{ 9, 6, 5, 2, 8, 6, 5, 8, 6, 9 },
		{ 8, 8, 8, 8, 8, 4, 8, 8, 8, 8 }, 
		{ 9, 5, 7, 4, 4, 4, 8, 7, 8, 5 }, 
		{ 9, 5, 8, 7, 8, 4, 6, 8, 7, 4 },
		{ 10, 9, 9, 9, 8, 9, 9, 9, 9, 9 }};
	float acumuladorFilas = 0;
	
	for(int x =0; x< 10; x++) {
		acumuladorFilas =0;

		
		for(int y =0; y < 10; y++) {
			acumuladorFilas=acumuladorFilas+ A[x] [y];
		}
		System.out.println("la media del alumno " +(x+1)+  " es " + (acumuladorFilas/10));
	}
	}
}



