package exerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		System.out.println("----------------------------------");
		System.out.println("\nVocê deverá digitar cinco cores!\n");
		System.out.println("----------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "ª cor: ");
			String cor = sc.next();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: \n");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}

		Collections.sort(cores);

		System.out.println("\nOrdenar todas as cores: \n");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}

		sc.close();
	}

}
