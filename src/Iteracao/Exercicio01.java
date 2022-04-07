package Iteracao;

import java.util.Scanner;

public class Exercicio01 {

	static final Integer DIVISOR = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };

		for (int i = 0; i < numeros.length; i++) {

			Integer divisao = numeros[i] % DIVISOR;

			if (divisao.equals(0)) {
				System.out.print("\n O numero " + numeros[i] + " é divisível por 3");
			}
		}
		scanner.close();
	}
}