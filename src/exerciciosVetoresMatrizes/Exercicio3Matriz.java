package exerciciosVetoresMatrizes;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[] diagonalPrincipal = new int[3];
		int[] diagonalSecundaria = new int[3];

		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					diagonalPrincipal[i] = matriz[i][j];
				}
				if (j == (matriz.length - 1 - i)) {
					diagonalSecundaria[i] = matriz[i][j];
				}
			}
		}

		System.out.println("Elementos da Diagonal Principal:");
		for (int x = 0; x < diagonalPrincipal.length; x++) {
			System.out.print(" " + diagonalPrincipal[x]);
			somaDiagonalPrincipal += diagonalPrincipal[x];
		}

		System.out.println("\nElementos da Diagonal Secundária:");

		for (int x = 0; x < diagonalSecundaria.length; x++) {
			System.out.print(" " + diagonalSecundaria[x]);
			somaDiagonalSecundaria += diagonalSecundaria[x];
		}

		System.out.println("\n\nSoma dos Elementos da Diagonal Principal:\n" + somaDiagonalPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária:\n" + somaDiagonalSecundaria);

	}

}
