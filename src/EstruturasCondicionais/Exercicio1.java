package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	static final float NOTA_MINIMA_PARA_PASSAR = 150;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua nota na prova de matem�tica: ");
		float notaDaProvaDeMat�matica = scanner.nextFloat();

		System.out.print("Informe sua nota na prova de portugu�s: ");
		float notaDaProvaDePortugues = scanner.nextFloat();

		float somaDasDuasProvas = notaDaProvaDeMat�matica + notaDaProvaDePortugues;

		boolean alcan�ouANotaMinima = somaDasDuasProvas >= 150;
		boolean n�oAlcan�ouAM�diaNaProvaDeMat�matica = notaDaProvaDeMat�matica < 60;
		boolean n�oAlcan�ouAM�diaNaProvaDePortugues = notaDaProvaDePortugues < 60;

		if (alcan�ouANotaMinima && n�oAlcan�ouAM�diaNaProvaDeMat�matica || n�oAlcan�ouAM�diaNaProvaDePortugues) {
			System.out.print("NOTA NA PROVA DE MATEMATICA: " + notaDaProvaDeMat�matica
					+ "\nNOTA NA PROVA DE PORTUGUES: " + notaDaProvaDePortugues + "NOTA FINAL: "+ somaDasDuasProvas);

		}
	}

}
