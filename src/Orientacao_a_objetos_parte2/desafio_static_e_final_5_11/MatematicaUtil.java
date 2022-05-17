package Orientacao_a_objetos_parte2.desafio_static_e_final_5_11;

import java.util.Scanner;

public class MatematicaUtil {
	public static final double PI = 3.14;
	public static final Scanner scanner = new Scanner(System.in);

	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}

	public static double calcularAreaCirculo(double area) {

		return area * area * MatematicaUtil.PI;
	}
}
