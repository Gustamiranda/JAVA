package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	static final float NOTA_MINIMA_PARA_PASSAR = 150;

	public static void mostrarNotas() {

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua nota na prova de matem�tica: ");
		float notaDaProvaDeMat�matica = scanner.nextFloat();

		System.out.print("Informe sua nota na prova de portugu�s: ");
		float notaDaProvaDePortugues = scanner.nextFloat();

		float somaDasDuasProvas = somaDasNotas(notaDaProvaDeMat�matica, notaDaProvaDePortugues);

		boolean alcan�ouANotaMinima = somaDasDuasProvas >= 150;
		boolean n�oAlcan�ouAM�diaNaProvaDeMat�matica = notaDaProvaDeMat�matica < 60;
		boolean n�oAlcan�ouAM�diaNaProvaDePortugues = notaDaProvaDePortugues < 60;

		if (n�oAlcan�ouAM�diaNaProvaDeMat�matica || n�oAlcan�ouAM�diaNaProvaDePortugues && alcan�ouANotaMinima) {

			System.out.print("Nota na prova de mat�matica: " + notaDaProvaDeMat�matica
					+ "\nNota na prova de portugu�s: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nInfelizmente voc� n�o passou.");
		} else if (alcan�ouANotaMinima) {
			System.out.print("Nota na prova de mat�matica: " + notaDaProvaDeMat�matica
					+ "\nNota na prova de portugu�s: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nParab�ns, voc� passou.");
		} else {

			System.out.print("Nota na prova de mat�matica: " + notaDaProvaDeMat�matica
					+ "\nNota na prova de portugu�s: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nInfelizmente voc� n�o passou.");
		}

	}

	public static float somaDasNotas(float notaDaProvaDeMat�matica, float notaDaProvaDePortugues) {

		return notaDaProvaDeMat�matica + notaDaProvaDePortugues;
	}

}
