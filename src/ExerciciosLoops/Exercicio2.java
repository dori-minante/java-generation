package ExerciciosLoops;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numerosPares = 0;
		int numerosImpares = 0;

		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Digite o " + numero + "º número: ");
			int valorDigitado = sc.nextInt();

			if (valorDigitado % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}

		System.out.println("\nO total de números pares: " + numerosPares);
		System.out.println("\nO total de números ímpares: " + numerosImpares);

		sc.close();
	}
}
