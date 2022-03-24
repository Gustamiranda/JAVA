package estruturaDeDecisao;

import java.util.Scanner;

public class Exericio01 {
	static final Scanner scanner = new Scanner(System.in);

	static final float NOTA_TOTAL_MINIMA_PARA_PASSAR = 150;
	static final float NOTA_MINIMA_PARA_PASSAR_EM_MATEMATICA = 60;
	static final float NOTA_MINIMA_PARA_PASSAR_EM_PORTUGUES = 60;

	public static void main(String[] args) {

		System.out.print("Informe sua nota na prova de matemática: ");
		float notaDaProvaDeMatematica = scanner.nextFloat();

		System.out.print("Informe sua nota na prova de português: ");
		float notaDaProvaDePortugues = scanner.nextFloat();

		float somaDasDuasProvas = somaDasNotas(notaDaProvaDeMatematica, notaDaProvaDePortugues);

		boolean naoalcançouANotaMinima = somaDasDuasProvas < NOTA_TOTAL_MINIMA_PARA_PASSAR;
		boolean naoAlcançouANotaMinimaNaProvaDeMatematica = notaDaProvaDeMatematica < NOTA_MINIMA_PARA_PASSAR_EM_MATEMATICA;
		boolean naoAlcançouANotaMinimaNaProvaDePortugues = notaDaProvaDePortugues < NOTA_MINIMA_PARA_PASSAR_EM_PORTUGUES;

		if (naoAlcançouANotaMinimaNaProvaDeMatematica || naoAlcançouANotaMinimaNaProvaDePortugues
				|| naoalcançouANotaMinima) {

			System.out.print("Nota na prova de matématica: " + notaDaProvaDeMatematica
					+ "\nNota na prova de português: " + notaDaProvaDePortugues + "\nNota total: " + somaDasDuasProvas);

			System.out.print("\nInfelizmente você não passou.");

		} else {

			System.out.print("Nota na prova de matématica: " + notaDaProvaDeMatematica
					+ "\nNota na prova de português: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nParabéns, você passou.");
		}

	}

	public static float somaDasNotas(float notaDaProvaDeMatématica, float notaDaProvaDePortugues) {

		return notaDaProvaDeMatématica + notaDaProvaDePortugues;
	}

}
