package exerciciosEstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Queue<String> filaCliente = new LinkedList<>();
		int opcao;

		do {
			exibirMenu();
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nomeCliente = sc.nextLine();
				adicionarCliente(filaCliente, nomeCliente);
				break;
			case 2:
				listarClientes(filaCliente);
				break;
			case 3:
				retirarCliente(filaCliente);
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

		sc.close();
	}

	private static void exibirMenu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("                       Menu                          ");
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("            1 - Adicionar cliente na fila            ");
		System.out.println("            2 - Listar todos os clientes             ");
		System.out.println("            3 - Retirar cliente da fila              ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");

	}

    private static void adicionarCliente(Queue<String> fila, String nome) {
        fila.add(nome);
        System.out.println("Cliente " + nome + " adicionado a fila.");
    }

    private static void listarClientes(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Clientes na fila: " + fila.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static void retirarCliente(Queue<String> fila) {
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia.");
        } else {
            String clienteRemovido = fila.poll();
            System.out.println("Cliente " + clienteRemovido + " retirado da fila.");
        }
    }
}
