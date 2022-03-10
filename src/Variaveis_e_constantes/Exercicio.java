package Variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor do produto: ");
		double valorDoProduto = scanner.nextDouble();
		System.out.print("Informe a quantidade de produtos que deseja comprar: ");
		byte quantidadeDeProdutos = scanner.nextByte();

		double subTotalDoValorDoProduto = subTotalDoValorDoProduto(valorDoProduto, quantidadeDeProdutos);
		double descontoNoSubtotalDoValorDoProduto = desconto(subTotalDoValorDoProduto);
		boolean quantidadeMaiorOuIgualADez = quantidadeDeProdutos > 10;

		System.out.print("Valor total: " + (subTotalDoValorDoProduto));

		if (quantidadeMaiorOuIgualADez) {
			System.out.print(
					"\nValor total após desconto: " + (subTotalDoValorDoProduto - descontoNoSubtotalDoValorDoProduto));
		}
		scanner.close();
	}

	public static double subTotalDoValorDoProduto(double valorDoProduto, byte quantidadesDeProdutos) {

		return valorDoProduto * quantidadesDeProdutos;
	}

	public static double desconto(double subTotalDoValorDoProduto) {

		return (subTotalDoValorDoProduto * 10.0) / 100;
	}

}
