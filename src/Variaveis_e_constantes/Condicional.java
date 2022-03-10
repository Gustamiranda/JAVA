package Variaveis_e_constantes;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a sua nota: ");
		int notaDoAluno = scanner.nextInt();
	
		if(notaDoAluno>=60) {
			
			System.out.print("Parabéns, você passou de ano.");
		}
		else{
			System.out.print("Parabéns, você reprovou.");
		}
	}

}
