package exerciciosEstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<>();
		Scanner sc = new Scanner(System.in);

		int opcao;
		do {
			exibirMenu();
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				adicionarLivro(pilhaLivros, sc);
				break;
			case 2:
				listarLivros(pilhaLivros);
				break;
			case 3:
				retirarLivro(pilhaLivros);
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				sc.close();
			}

		} while (opcao != 0);
	}

	private static void exibirMenu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("                       Menu                          ");
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("            1 - Adicionar livro                      ");
		System.out.println("            2 - Listar todos os livros               ");
		System.out.println("            3 - Retirar livro                        ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
	}

	private static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
		scanner.nextLine();
		System.out.print("Digite o nome do livro: ");
		String nomeLivro = scanner.nextLine();
		pilhaLivros.push(nomeLivro);
		System.out.println("Livro adicionado com sucesso!");
	}

	private static void listarLivros(Stack<String> pilhaLivros) {
		if (pilhaLivros.isEmpty()) {
			System.out.println("A pilha está vazia. Não há livros para listar.");
		} else {
			System.out.println("Livros na pilha:");
			for (String livro : pilhaLivros) {
				System.out.println("- " + livro);
			}
		}
	}

	private static void retirarLivro(Stack<String> pilhaLivros) {
		if (pilhaLivros.isEmpty()) {
			System.out.println("A pilha está vazia. Não há livros para retirar.");
		} else {
			String livroRetirado = pilhaLivros.pop();
			System.out.println("Livro retirado: " + livroRetirado);
		}

	}
}
