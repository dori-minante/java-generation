package exerciciospraticos;

import java.util.Scanner;

public class Fluxograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = sc.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
				
		System.out.println("O novo salário será no valor de R$ " + novoSalario);
		
		sc.close();
	}

}
