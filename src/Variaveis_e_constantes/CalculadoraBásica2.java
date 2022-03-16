package Variaveis_e_constantes;

import java.util.Scanner;

public class CalculadoraBásica2 {

	static final Integer ADICAO = 1;
	static final Integer SUBTRACAO = 2;
	static final Integer MULTIPLICACAO = 3;
	static final Integer DIVISAO = 4;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int escolhaDaOperação;

		System.out.println("Digite o primeiro número da operação: ");
		int primeiroNumero = scanner.nextInt();

		System.out.print("\n(1)Adição \n(2)Subtração \n(3)Multiplicação \n(4)Divisão");
		System.out.print("\nEscolha a operação matématica: ");
		escolhaDaOperação = scanner.nextInt();

		if (escolhaDaOperação < 1 || escolhaDaOperação > 4) {
			while (escolhaDaOperação < 1 || escolhaDaOperação > 4) {
				System.out.print("\nPor favor, digite um número correto");
				System.out.print("\n(1)Adição \n(2)Subtração \n(3)Multiplicação \n(4)Divisão");
				System.out.print("\nEscolha a operação matématica: ");
				escolhaDaOperação = scanner.nextInt();

			}
		}
		System.out.print("Digite o segundo numero da operação: ");
		int segundoNumero = scanner.nextInt();

		boolean escolherSoma = escolhaDaOperação == ADICAO;
		boolean escolherSubtração = escolhaDaOperação == SUBTRACAO;
		boolean escolherMultiplicação = escolhaDaOperação == MULTIPLICACAO;
		boolean escolherDivisao = escolhaDaOperação == DIVISAO;

		if (escolherSoma) {
			System.out.print(
					"Adição: " + primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		}

		else if (escolherSubtração) {
			System.out.print(
					"Subtração: " + primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		}

		else if (escolherMultiplicação) {
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
