package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a medida do raio de um circulo: ");
		double raio = scanner.nextDouble();
		System.out.print("A area do circulo de raio " + raio + " é " + (2 * raio));
	}

}
