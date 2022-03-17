package Variaveis_e_constantes;

import java.util.Scanner;

public class CalculadoraB�sica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int escolhaDaOperacao;

		System.out.println("Digite o primeiro n�mero da opera��o: ");
		int primeiroNumero = scanner.nextInt();

		System.out.print("\n(1)Adi��o \n(2)Subtra��o \n(3)Multiplica��o \n(4)Divis�o");
		System.out.print("\nEscolha a opera��o mat�matica: ");
		escolhaDaOperacao = scanner.nextInt();

		if (escolhaDaOperacao < 1 || escolhaDaOperacao > 4) {
			while (escolhaDaOperacao < 1 || escolhaDaOperacao > 4) {
				System.out.print("\nPor favor, digite um n�mero correto");
				System.out.print("\n(1)Adi��o \n(2)Subtra��o \n(3)Multiplica��o \n(4)Divis�o");
				System.out.print("\nEscolha a opera��o mat�matica: ");
				escolhaDaOperacao = scanner.nextInt();

			}
		}
		System.out.print("Digite o segundo numero da opera��o: ");
		int segundoNumero = scanner.nextInt();

		switch (escolhaDaOperacao) {

		case 1: {

			System.out.print(
					"Adi��o: " + primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		}
			break;

		case 2: {
			System.out.print(
					"Subtra��o: " + primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		}
			break;

		case 3: {
			System.out.print("Multiplica��o: " + primeiroNumero + " * " + segundoNumero + " = "
					+ (primeiroNumero * segundoNumero));
		}
			break;

		case 4: {
			double Divis�o = primeiroNumero / segundoNumero;
			System.out.print("Divis�o: " + primeiroNumero + " / " + segundoNumero + " = " + (Divis�o));
		}
			break;
		}
		scanner.close();

	}

}
