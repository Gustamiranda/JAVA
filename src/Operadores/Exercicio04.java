package Operadores;

import java.util.Scanner;

public class Exercicio04 {
	static final byte TEMPO_MINIMO_DE_CONTRIBUIÇÃO = 25;
	static final byte IDADE_MINIMA_PARA_APOSENTAR = 55;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Por favor informe a sua idade: ");
		byte idade = scanner.nextByte();

		System.out.print("Informe o tempo de contribuição com a previdência: ");
		byte tempoDeContribuição = scanner.nextByte();

		boolean atenderaosRequisitos = idade >= IDADE_MINIMA_PARA_APOSENTAR
				&& tempoDeContribuição >= TEMPO_MINIMO_DE_CONTRIBUIÇÃO;

		if (atenderaosRequisitos) {
			System.out.print("Você pode se aposentar.");
		} else {
			System.out.print("Você não pode se aposentar.");
		}
		scanner.close();
	}

}
