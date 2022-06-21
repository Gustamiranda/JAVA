package Orientacao_a_objetos_parte2._6_10_desafio_numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #, ##0.00");

		System.out.println("Digite sua m�e: ");
		double suaM�e = scanner.nextDouble();

		BigDecimal Produto = new BigDecimal(suaM�e);

		Produto = Produto.divide(BigDecimal.TEN);

		System.out.println(formatador.format(Produto));
	}

}
