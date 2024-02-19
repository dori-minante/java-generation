package ExerciciosLoops;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalBackend = 0;
		int mulheresCisTransFrontend = 0;
		int homensCisTransMobileAcima40 = 0;
		int naoBinariosFullStackMenor30 = 0;
		int totalPessoas = 0;
		int somaIdades = 0;

		char continuar = 'S';

		while (continuar == 'S') {
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Qual a identidade de gênero? Digite o número correspondente\n1 – Mulher Cis\n"
					+ "2 – Homem Cis\n3 – Não Binário\n4 – Mulher Trans\n5 – Homem Trans\n6 – Outros\n");
			int genero = sc.nextInt();
			System.out.println("Você é uma Pessoa Desenvolvedora? (Digite o número correspondente):\n"
					+ "1 – Backend\n2 – Frontend\n3 – Mobile\n4 – FullStack");
			int dev = sc.nextInt();

			if (dev == 1) {
				totalBackend++;
			}
			if ((genero == 1 || genero == 4) && dev == 2) {
				mulheresCisTransFrontend++;
			}
			if ((genero == 2 || genero == 5) && dev == 3 && idade > 40) {
				homensCisTransMobileAcima40++;
			}
			if (genero == 3 && dev == 4 && idade < 30) {
				naoBinariosFullStackMenor30++;
			}

			totalPessoas++;
			somaIdades += idade;

			System.out.println("Deseja continuar a leitura dos dados de um novo colaborador? (S/N)");
			continuar = sc.next().charAt(0);
		}

		System.out.println("O número de pessoas desenvolvedoras Backend é: " + totalBackend);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend é: " + mulheresCisTransFrontend);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos é: "
				+ homensCisTransMobileAcima40);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos é: "
				+ naoBinariosFullStackMenor30);
		System.out.println("O número total de pessoas que responderam à pesquisa é: " + totalPessoas);

		if (totalPessoas > 0) {
			double mediaIdades = (double) somaIdades / totalPessoas;
			System.out.println("A média de idade das pessoas que responderam à pesquisa é: " + mediaIdades);
		} else {
			System.out.println("Nenhuma pessoa respondeu a pesquisa");
		}

		sc.close();

	}

}
