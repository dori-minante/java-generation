package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int numero;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		String parOuImpar;
		if (numero % 2 == 0) {
			parOuImpar = "par";
		} else {
			parOuImpar = "ímpar";
		}

		String positivoOuNegativo;
		if (numero >= 0) {
			positivoOuNegativo = "positivo!";
		} else {
			positivoOuNegativo = "negativo!";
		}

		System.out.println("O número " + numero + " é " + parOuImpar + " e " + positivoOuNegativo);

		leia.close();
	}

}
