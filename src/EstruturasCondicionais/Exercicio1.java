package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		pedirNumerosEExibirOMaior();

	}

	public static void pedirNumerosEExibirOMaior() {

		float[] numero = new float[2];

		float maior = 0;

		for (int c = 0; c < numero.length; c++) {

			System.out.print("Informe o " + (c + 1) + "° Numero: ");
			numero[c] = scanner.nextInt();

			if (numero[c] > maior) {

				maior = numero[c];
			}
		}
		System.out.print("Maior numero: " + maior);

	}

}
