package exerciciospraticos;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite valor do salário bruto: ");
		salarioBruto = Float.parseFloat(sc.next());
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = Float.parseFloat(sc.next());
		
		System.out.println("Digite o valor das horas extras: ");
		horasExtras = Float.parseFloat(sc.next());
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = Float.parseFloat(sc.next());
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O Salário Líquido é R$ %.2f%n", salarioLiquido);
		sc.close();
		
	}

}
