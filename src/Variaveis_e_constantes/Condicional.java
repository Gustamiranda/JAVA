package Variaveis_e_constantes;

import java.util.Scanner;

public class Condicional {
	static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a sua nota: ");
		int notaDoAluno = scanner.nextInt();

		boolean notaParaPassarDeAno = notaDoAluno >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;

		if (notaParaPassarDeAno) {
			System.out.print("Parabéns, você passou de ano.");
		} else {
			System.out.print("Parabéns, você reprovou.");
		}

		scanner.close();
	}

}
