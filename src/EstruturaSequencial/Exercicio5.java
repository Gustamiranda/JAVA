package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor em metros: ");
		double metros = scanner.nextDouble();
		System.out.print("O valor em centimetros é "+ metros * 100); 

	}

}
