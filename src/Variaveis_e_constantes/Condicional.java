package Variaveis_e_constantes;

import java.util.Scanner;

public class Condicional {
	static final Integer NOTA_PARA_PASSAR = 70;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a sua nota: ");
		int notaDoAluno = scanner.nextInt();

		boolean notaParaPassarDeAno = notaDoAluno >= NOTA_PARA_PASSAR;

		if (notaParaPassarDeAno) {
			System.out.print("Parabéns, você passou de ano.");
		} else {
			System.out.print("Parabéns, você reprovou.");
		}
	}

}
