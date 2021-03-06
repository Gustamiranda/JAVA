package Variaveis_e_constantes;

import java.util.Scanner;

public class CalculadoraB?sica2 {

	static final Integer ADICAO = 1;
	static final Integer SUBTRACAO = 2;
	static final Integer MULTIPLICACAO = 3;
	static final Integer DIVISAO = 4;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int escolhaDaOperacao;

		System.out.println("Digite o primeiro n?mero da opera??o: ");
		int primeiroNumero = scanner.nextInt();

		System.out.print("\n(1)Adi??o \n(2)Subtra??o \n(3)Multiplica??o \n(4)Divis?o");
		System.out.print("\nEscolha a opera??o mat?matica: ");
		escolhaDaOperacao = scanner.nextInt();

		if (escolhaDaOperacao < 1 || escolhaDaOperacao > 4) {
			while (escolhaDaOperacao < 1 || escolhaDaOperacao > 4) {
				System.out.print("\nPor favor, digite um n?mero correto");
				System.out.print("\n(1)Adi??o \n(2)Subtra??o \n(3)Multiplica??o \n(4)Divis?o");
				System.out.print("\nEscolha a opera??o mat?matica: ");
				escolhaDaOperacao = scanner.nextInt();

			}
		}
		System.out.print("Digite o segundo numero da opera??o: ");
		int segundoNumero = scanner.nextInt();

		boolean escolherSoma = escolhaDaOperacao == ADICAO;
		boolean escolherSubtracao = escolhaDaOperacao == SUBTRACAO;
		boolean escolherMultiplicacao = escolhaDaOperacao == MULTIPLICACAO;
		boolean escolherDivisao = escolhaDaOperacao == DIVISAO;

		if (escolherSoma) {
			System.out.print(
					"Adi??o: " + primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		}

		else if (escolherSubtracao) {
			System.out.print(
					"Subtra??o: " + primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		}

		else if (escolherMultiplicacao) {
			System.out.print("Multiplica??o: " + primeiroNumero + " * " + segundoNumero + " = "
					+ (primeiroNumero * segundoNumero));
		}

		else if (escolherDivisao) {
			double Divis?o = primeiroNumero / segundoNumero;
			System.out.print("Divis?o: " + primeiroNumero + " / " + segundoNumero + " = " + (Divis?o));
		}
		scanner.close();
	}
}
