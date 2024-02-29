package exerciciosLoops;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int menorNumero, maiorNumero;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		menorNumero = leia.nextInt();
		System.out.println("Digite o segundo número:");
		maiorNumero = leia.nextInt();

		if (menorNumero >= maiorNumero) {
			System.out.println("O primeiro número digitado é maior que o segundo, intervalo inválido!");
		} else {
			System.out.println("\nNo Intervalo entre " + menorNumero + " e " + maiorNumero + ":\n");
		}

		for (int i = menorNumero; i <= maiorNumero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é múltiplo de 3 e 5.");
			}

		}

		leia.close();
	}

}
