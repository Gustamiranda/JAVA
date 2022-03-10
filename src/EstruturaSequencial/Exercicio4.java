package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[4];
		double media;
		int soma = 0;
		
		for(int i= 0; i<4; i++) {
			
		System.out.print("Informe a "+ (i+1) + "° nota");
		notas[i] = scanner.nextDouble(); 	
		soma+= notas[i];		
	}
		media = soma/4;	
		System.out.print("Média: "+ media);
	}

}
