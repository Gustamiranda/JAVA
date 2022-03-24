package estruturaDeDecisao;

import java.util.Scanner;

public class Exericio01 {
	static final Scanner scanner = new Scanner(System.in);

	static final float NOTA_TOTAL_MINIMA_PARA_PASSAR = 150;
	static final float NOTA_MINIMA_PARA_PASSAR_EM_MATEMATICA = 60;
	static final float NOTA_MINIMA_PARA_PASSAR_EM_PORTUGUES = 60;

	public static void main(String[] args) {

		System.out.print("Informe sua nota na prova de matem�tica: ");
		float notaDaProvaDeMatematica = scanner.nextFloat();

		System.out.print("Informe sua nota na prova de portugu�s: ");
		float notaDaProvaDePortugues = scanner.nextFloat();

		float somaDasDuasProvas = somaDasNotas(notaDaProvaDeMatematica, notaDaProvaDePortugues);

		boolean naoalcan�ouANotaMinima = somaDasDuasProvas < NOTA_TOTAL_MINIMA_PARA_PASSAR;
		boolean naoAlcan�ouANotaMinimaNaProvaDeMatematica = notaDaProvaDeMatematica < NOTA_MINIMA_PARA_PASSAR_EM_MATEMATICA;
		boolean naoAlcan�ouANotaMinimaNaProvaDePortugues = notaDaProvaDePortugues < NOTA_MINIMA_PARA_PASSAR_EM_PORTUGUES;

		if (naoAlcan�ouANotaMinimaNaProvaDeMatematica || naoAlcan�ouANotaMinimaNaProvaDePortugues
				|| naoalcan�ouANotaMinima) {

			System.out.print("Nota na prova de mat�matica: " + notaDaProvaDeMatematica
					+ "\nNota na prova de portugu�s: " + notaDaProvaDePortugues + "\nNota total: " + somaDasDuasProvas);

			System.out.print("\nInfelizmente voc� n�o passou.");

		} else {

			System.out.print("Nota na prova de mat�matica: " + notaDaProvaDeMatematica
					+ "\nNota na prova de portugu�s: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nParab�ns, voc� passou.");
		}

	}

	public static float somaDasNotas(float notaDaProvaDeMat�matica, float notaDaProvaDePortugues) {

		return notaDaProvaDeMat�matica + notaDaProvaDePortugues;
	}

}
