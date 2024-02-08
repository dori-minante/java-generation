package exerciciospraticos;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, calculo;
		
		System.out.println("Digite o primeiro número: ");
		n1 = Float.parseFloat(sc.next());
		System.out.println("Digite  segundo número: ");
		n2 = Float.parseFloat(sc.next());
		System.out.println("Digite o terceiro número: ");
		n3 = Float.parseFloat(sc.next());
		System.out.println("Digite o quarto número: ");
		n4 = Float.parseFloat(sc.next());
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença entre os produtos foi: " + calculo);
	}

}
