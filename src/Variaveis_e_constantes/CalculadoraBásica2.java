package Variaveis_e_constantes;

import java.util.Scanner;

public class CalculadoraB�sica2 {

	static final Integer ADICAO = 1;
	static final Integer SUBTRACAO = 2;
	static final Integer MULTIPLICACAO = 3;
	static final Integer DIVISAO = 4;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int escolhaDaOpera��o;

		System.out.println("Digite o primeiro n�mero da opera��o: ");
		int primeiroNumero = scanner.nextInt();

		System.out.print("\n(1)Adi��o \n(2)Subtra��o \n(3)Multiplica��o \n(4)Divis�o");
		System.out.print("\nEscolha a opera��o mat�matica: ");
		escolhaDaOpera��o = scanner.nextInt();

		if (escolhaDaOpera��o < 1 || escolhaDaOpera��o > 4) {
			while (escolhaDaOpera��o < 1 || escolhaDaOpera��o > 4) {
				System.out.print("\nPor favor, digite um n�mero correto");
				System.out.print("\n(1)Adi��o \n(2)Subtra��o \n(3)Multiplica��o \n(4)Divis�o");
				System.out.print("\nEscolha a opera��o mat�matica: ");
				escolhaDaOpera��o = scanner.nextInt();

			}
		}
		System.out.print("Digite o segundo numero da opera��o: ");
		int segundoNumero = scanner.nextInt();

		boolean escolherSoma = escolhaDaOpera��o == ADICAO;
		boolean escolherSubtra��o = escolhaDaOpera��o == SUBTRACAO;
		boolean escolherMultiplica��o = escolhaDaOpera��o == MULTIPLICACAO;
		boolean escolherDivisao = escolhaDaOpera��o == DIVISAO;

		if (escolherSoma) {
			System.out.print(
					"Adi��o: " + primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		}

		else if (escolherSubtra��o) {
			System.out.print(
					"Subtra��o: " + primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		}

		else if (escolherMultiplica��o) {
			System.out.print("Multiplica��o: " + primeiroNumero + " * " + segundoNumero + " = "
					+ (primeiroNumero * segundoNumero));
		}

		else if (escolherDivisao) {
			double Divis�o = primeiroNumero / segundoNumero;
			System.out.print("Divis�o: " + primeiroNumero + " / " + segundoNumero + " = " + (Divis�o));
		}
		scanner.close();
	}
}
