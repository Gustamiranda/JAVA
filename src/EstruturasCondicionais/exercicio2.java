package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int numero = scanner.nextInt();

		boolean positivo = verificarSeNumeroPositivo(numero);

		exibirResultado(positivo);

	}

	public static boolean verificarSeNumeroPositivo(int numero) {

		return numero >= 0;
	}

	public static void exibirResultado(boolean positivo) {

		if (positivo) {
			System.out.print("O numero é positivo");
		} else {
			System.out.print("O numero é negativo");
		}

	}

}
