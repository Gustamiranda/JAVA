package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a Letra: ");
		char letraDigitada = scanner.next().charAt(0);

		boolean sexoMasculino = Masculino(letraDigitada);
		boolean sexoFeminino = Feminino(letraDigitada);

		exibirResultado(sexoMasculino, sexoFeminino);
	}

	public static boolean Feminino(char letradigitada) {

		return letradigitada == 'F' || letradigitada == 'f';
	}

	public static boolean Masculino(char letraDigitada) {
		return letraDigitada == 'M' || letraDigitada == 'm';

	}

	public static void exibirResultado(boolean sexoMasculino, boolean sexoFeminino) {

		if (sexoMasculino) {
			System.out.print("Sexo masculino");
		} else if (sexoFeminino) {
			System.out.print("Sexo feminino");
		} else {
			System.out.print("Inválido");
		}
	}
}
