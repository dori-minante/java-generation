package exerciciospraticos;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = Float.parseFloat(sc.next());
		System.out.println("Digite a segunda nota: ");
		nota2 = Float.parseFloat(sc.next());
		System.out.println("Digite a terceira nota: ");
		nota3 = Float.parseFloat(sc.next());
		System.out.println("Digite a quarta nota: ");
		nota4 = Float.parseFloat(sc.next());
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média final do participante é: %.2f%n", mediaFinal);

		sc.close();
		
	}

}
