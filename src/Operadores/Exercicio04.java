package Operadores;

import java.util.Scanner;

public class Exercicio04 {
	static final byte TEMPO_MINIMO_DE_CONTRIBUI�AO = 25;
	static final byte IDADE_MINIMA_PARA_APOSENTAR = 55;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Por favor informe a sua idade: ");
		byte idadeDoUsuario = scanner.nextByte();

		System.out.print("Informe o tempo de contribui��o com a previd�ncia: ");
		byte tempoDeContribui�ao = scanner.nextByte();

		boolean atenderAosRequisitos = idadeDoUsuario >= IDADE_MINIMA_PARA_APOSENTAR
				&& tempoDeContribui�ao >= TEMPO_MINIMO_DE_CONTRIBUI�AO;

		if (atenderAosRequisitos) {
			System.out.print("Voc� pode se aposentar.");
		} else {
			System.out.print("Voc� n�o pode se aposentar.");
		}
		scanner.close();
	}

}
