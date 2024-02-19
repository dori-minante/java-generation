package ExerciciosLoops;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero; 
		int somaMultiplos = 0;
		int quantidadeMultiplos = 0;
		
		do {
			System.out.println("Digite um número (para finalizar, digite 0): ");
			numero = sc.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				somaMultiplos += numero;
				quantidadeMultiplos++;
			}
				
		} while (numero != 0);
		
		if (quantidadeMultiplos > 0) {
            double mediaMultiplos = (double) somaMultiplos / quantidadeMultiplos;
            System.out.println("A média de todos os números múltiplos de 3 é: " + mediaMultiplos);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }

		sc.close();

	}

}
