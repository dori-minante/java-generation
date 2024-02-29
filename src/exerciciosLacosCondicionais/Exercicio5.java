package exerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		String produto;
		int codigoProduto, quantidade;
		double preco, valorTotal;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o código do produto: ");
		codigoProduto = leia.nextInt();
		System.out.println("Digite a quantidade de produtos: ");
		quantidade = leia.nextInt();

		switch (codigoProduto) {

		case 1:
			produto = "Cachorro Quente";
			preco = 10.00;
			break;
		case 2:
			produto = "X Salada";
			preco = 15.00;
			break;
		case 3:
			produto = "X Bacon";
			preco = 18.00;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8.00;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13.00;
			break;
		default:
			System.out.println("Código de produto inválido.");
			leia.close();
			return;

		}

		valorTotal = quantidade * preco;

		System.out.println("\nO produto comprado foi: " + produto);
		System.out.printf("O valor total da conta foi R$ %.2f%n", valorTotal);

		leia.close();
	}

}
