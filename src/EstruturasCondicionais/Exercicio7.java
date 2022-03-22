package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio7 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		pedirNumerosEExibirOMaiorEOMenor();
	}

	public static void pedirNumerosEExibirOMaiorEOMenor() {
		int[] numeros = new int[3];
		int maior = 0;
		int menor = numeros[0];
		for (int c = 0; c < numeros.length; c++) {

			System.out.print("Informe o " + (c + 1) + "° número: ");
			numeros[c] = scanner.nextInt();

			if (numeros[c] > maior) {

				maior = numeros[c];

			}
			if (numeros[c] < menor) {

				menor = numeros[c];

			}

		}
		System.out.print("Maior numero: " + maior);

		System.out.print("Menor numero: " + menor);

	}
}
