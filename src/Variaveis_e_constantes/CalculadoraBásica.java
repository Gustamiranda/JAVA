package Variaveis_e_constantes;

import java.util.Scanner;

public class CalculadoraBásica {

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

		switch (escolhaDaOperacao) {

		case 1: {

			System.out.print(
					"Adição: " + primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		}
			break;

		case 2: {
			System.out.print(
					"Subtração: " + primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		}
			break;

		case 3: {
			System.out.print("Multiplicação: " + primeiroNumero + " * " + segundoNumero + " = "
					+ (primeiroNumero * segundoNumero));
		}
			break;

		case 4: {
			double Divisão = primeiroNumero / segundoNumero;
			System.out.print("Divisão: " + primeiroNumero + " / " + segundoNumero + " = " + (Divisão));
		}
			break;
		}
		scanner.close();

	}

}
