package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	static final float NOTA_MINIMA_PARA_PASSAR = 150;
	static final float NOTA_MINIMA_PARA_PASSAR_EM_MATEMATICA = 60;
	static final float NOTA_MINIMA_PARA_PASSAR_EM_PORTUGUES = 60;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua nota na prova de matemática: ");
		float notaDaProvaDeMatématica = scanner.nextFloat();

		System.out.print("Informe sua nota na prova de português: ");
		float notaDaProvaDePortugues = scanner.nextFloat();

		float somaDasDuasProvas = somaDasNotas(notaDaProvaDeMatématica, notaDaProvaDePortugues);

		boolean nãoalcançouANotaMinima = somaDasDuasProvas < NOTA_MINIMA_PARA_PASSAR;
		boolean nãoAlcançouAMédiaNaProvaDeMatématica = notaDaProvaDeMatématica < NOTA_MINIMA_PARA_PASSAR_EM_MATEMATICA;
		boolean nãoAlcançouAMédiaNaProvaDePortugues = notaDaProvaDePortugues < NOTA_MINIMA_PARA_PASSAR_EM_PORTUGUES;

		if (nãoAlcançouAMédiaNaProvaDeMatématica || nãoAlcançouAMédiaNaProvaDePortugues || nãoalcançouANotaMinima) {

			System.out.print("Nota na prova de matématica: " + notaDaProvaDeMatématica
					+ "\nNota na prova de português: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nInfelizmente você não passou.");

		} else {

			System.out.print("Nota na prova de matématica: " + notaDaProvaDeMatématica
					+ "\nNota na prova de português: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nParabéns, você passou.");
		}

	}

	public static float somaDasNotas(float notaDaProvaDeMatématica, float notaDaProvaDePortugues) {

		return notaDaProvaDeMatématica + notaDaProvaDePortugues;
	}

}
