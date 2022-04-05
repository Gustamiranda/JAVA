package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		PedirnumerosEExibirOMaior();

	}

	public static void PedirnumerosEExibirOMaior() {

		int[] numeros = new int[2];

		int maior = 0;

		for (int c = 0; c < numeros.length; c++) {

			System.out.print("Informe o " + (c + 1) + "° Numero: ");
			numeros[c] = scanner.nextInt();

			if (numeros[c] > maior) {

				maior = numeros[c];
			}
		}
		System.out.print("Maior numero: " + maior);

	}

}
