package _6_topicos_avancados._6_3_desafio_classe_java_lang_math;

import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantidaDeJogos[] = new int[1];

		for (int c = 0; c < 1; c++) {

			System.out.println("Informe o número de jogos que você deseja: ");
			quantidaDeJogos[c] = scanner.nextInt();
		}

		for (int c = 0; c <= quantidaDeJogos[c]; c++) {
			for (int b = 0; b < 6; b++) {
				double sequencia = Math.random() * 60;

				System.out.println("Números sorteados: " + Math.round(sequencia));

			}
		}
	}
}
