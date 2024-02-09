package ExerciciosLacosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		String nomeColaborador, nomeCargo;
		int cargoColaborador;
		float salario, reajuste, novoSalario;
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do colaborador: ");
		nomeColaborador = leia.next();
		leia.nextLine();
		System.out.println("Digite o código do cargo: ");
		cargoColaborador = leia.nextInt();
		System.out.println("Digite o salário do colaborador R$ ");
		leia.nextLine();
		salario = leia.nextFloat();

		switch (cargoColaborador) {

		case 1:
			nomeCargo = "Gerente";
			reajuste = 0.10f;
			break;
		case 2:
			nomeCargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			nomeCargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			nomeCargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			nomeCargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			nomeCargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
		default:
			System.out.println("Código do cargo inválido.");
			leia.close();
			return;

		}

		novoSalario = salario + (reajuste * salario);

		System.out.println("\nNome do colaborador: " + nomeColaborador);
		System.out.println("Cargo: " + nomeCargo);
		System.out.printf("Salário: R$ %.2f%n", novoSalario);

		leia.close();
	}

}
