package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio6 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		pedirNumerosEExibirOMaior();

	}

	public static void pedirNumerosEExibirOMaior() {
		int[] numeros = new int[3];
		int maior = 0;

		for (int c = 0; c < numeros.length; c++) {

			System.out.print("Informe o " + (c + 1) + "? n?mero: ");
			numeros[c] = scanner.nextInt();

			if (numeros[c] > maior) {

				maior = numeros[c];

			}
		}
		System.out.print("Maior numero: " + maior);

	}
}
