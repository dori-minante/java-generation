package exerciciosCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		System.out.println("--------------------------------------------------");
		System.out.println("\nVocê deverá digitar dez números não repetidos!\n");
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a " + (i + 1) + "º número: ");
			int numero = sc.nextInt();
			numeros.add(numero);
		}

		System.out.println("\nListar dados do Set: \n");
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		sc.close();
	}

}
