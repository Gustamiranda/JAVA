package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio8 {

	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double[] precos = new double[3];

		for (int c = 0; c < precos.length; c++) {

			System.out.print("Informe o preço do " + (c + 1) + "° produto: ");
			precos[c] = scanner.nextDouble();

		}
		double menor = precos[0];

		for (int c = 0; c < precos.length; c++) {

			if (menor > precos[c]) {

				menor = precos[c];
			}

		}

		System.out.print("O produto que você deve comprar é o de " + menor + "R$");
	}

}
