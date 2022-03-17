package Variaveis_e_constantes;

import java.util.Scanner;

public class CalculadoraBásica2 {

	static final Integer ADICAO = 1;
	static final Integer SUBTRACAO = 2;
	static final Integer MULTIPLICACAO = 3;
	static final Integer DIVISAO = 4;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int escolhaDaOperacao;

		System.out.println("Digite o primeiro número da operação: ");
		int primeiroNumero = scanner.nextInt();

		System.out.print("\n(1)Adição \n(2)Subtração \n(3)Multiplicação \n(4)Divisão");
		System.out.print("\nEscolha a operação matématica: ");
		escolhaDaOperacao = scanner.nextInt();

		if (escolhaDaOperacao < 1 || escolhaDaOperacao > 4) {
			while (escolhaDaOperacao < 1 || escolhaDaOperacao > 4) {
				System.out.print("\nPor favor, digite um número correto");
				System.out.print("\n(1)Adição \n(2)Subtração \n(3)Multiplicação \n(4)Divisão");
				System.out.print("\nEscolha a operação matématica: ");
				escolhaDaOperacao = scanner.nextInt();

			}
		}
		System.out.print("Digite o segundo numero da operação: ");
		int segundoNumero = scanner.nextInt();

		boolean escolherSoma = escolhaDaOperacao == ADICAO;
		boolean escolherSubtracao = escolhaDaOperacao == SUBTRACAO;
		boolean escolherMultiplicacao = escolhaDaOperacao == MULTIPLICACAO;
		boolean escolherDivisao = escolhaDaOperacao == DIVISAO;

		if (escolherSoma) {
			System.out.print(
					"Adição: " + primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		}

		else if (escolherSubtracao) {
			System.out.print(
					"Subtração: " + primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		}

		else if (escolherMultiplicacao) {
			System.out.print("Multiplicação: " + primeiroNumero + " * " + segundoNumero + " = "
					+ (primeiroNumero * segundoNumero));
		}

		else if (escolherDivisao) {
			double Divisão = primeiroNumero / segundoNumero;
			System.out.print("Divisão: " + primeiroNumero + " / " + segundoNumero + " = " + (Divisão));
		}
		scanner.close();
	}
}
