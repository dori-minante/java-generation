package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {

		int[] v = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		int numero;
		String msg = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();

		for (int i = 0; i < v.length; i++) {
			if (v[i] == numero) {
				msg = "O número " + numero + " está localizado na posição: " + i;
				break;
			} else
				msg = "O número " + numero + " não foi encontrado";
		}

		System.out.println(msg);

		sc.close();
	}
}
