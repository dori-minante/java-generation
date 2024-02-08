package exerciciospraticos;

import java.util.Locale;
import java.util.Scanner;

public class Fluxograma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = Float.parseFloat(sc.next());
		
		System.out.println("Digite o abono: ");
		abono = Float.parseFloat(sc.next());
		
		novoSalario = salario + abono;
				
		System.out.printf("O novo salário será no valor de R$ %.2f%n", novoSalario);
		
		sc.close();
	}

}
