package Operadores;

import java.util.Scanner;

public class Exercicio04 {
	static final byte TEMPO_MINIMO_DE_CONTRIBUI��O = 25;
	static final byte IDADE_MINIMA = 55;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Por favor informe a sua idade: ");
		byte idade = scanner.nextByte();

		System.out.print("Informe o tempo de contribui��o com a previd�ncia: ");
		byte tempoDeContribui��o = scanner.nextByte();

		boolean pessoaEstiver�pta = idade >= IDADE_MINIMA && tempoDeContribui��o >= TEMPO_MINIMO_DE_CONTRIBUI��O;

		if (pessoaEstiver�pta) {
			System.out.print("Voc� pode se aposentar.");
		}

	}

}
