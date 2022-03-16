package Operadores;

import java.util.Scanner;

public class Exercicio04 {
	static final byte TEMPO_MINIMO_DE_CONTRIBUI��O = 25;
	static final byte IDADE_MINIMA_PARA_APOSENTAR = 55;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Por favor informe a sua idade: ");
		byte idade = scanner.nextByte();

		System.out.print("Informe o tempo de contribui��o com a previd�ncia: ");
		byte tempoDeContribui��o = scanner.nextByte();

		boolean passarNasCondi��es = idade >= IDADE_MINIMA_PARA_APOSENTAR && tempoDeContribui��o >= TEMPO_MINIMO_DE_CONTRIBUI��O;

		if (passarNasCondi��es) {
			System.out.print("Voc� pode se aposentar.");
		}
		scanner.close();
	}

}
