package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a medida do lado de um quadrado: ");
		int lado = scanner.nextInt();

		System.out.print("A area do quadrado de lado " + lado + " é " + (lado * lado));
		System.out.print("O dobro da area é " + (lado * lado) * 2);

	}

}
