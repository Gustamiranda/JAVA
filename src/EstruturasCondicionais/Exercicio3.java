package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a Letra: ");
		char letradigitada = scanner.next().charAt(0);

		verificarLetra(letradigitada);
	}

	public static void verificarLetra(char letradigitada) {

		boolean letraF = letradigitada == 'F' || letradigitada == 'f';
		boolean letraM = letradigitada == 'M' || letradigitada == 'm';

		if (letraF) {

			System.out.print("Sexo feminino");
		} else if (letraM) {
			System.out.print("Sexo masculino");
		} else {
			System.out.print("Sexo Invalido");
		}

	}

}
