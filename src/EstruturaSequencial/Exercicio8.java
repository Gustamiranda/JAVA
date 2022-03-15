package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o ganho pro hora: ");
		double salarioPorHora = scanner.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		int horas = scanner.nextInt();
		System.out.print("Seu salario neste mes sera: " + (salarioPorHora * horas));
	}

}
