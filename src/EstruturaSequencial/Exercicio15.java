package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quanto voce ganha por hora: ");
		float valorPorHora = scanner.nextFloat();
		 
		 
		System.out.print("Quantas horas voce trabalhou no mes: ");
		 float horasTrabalhadas = scanner.nextFloat();
				double salarioBruto = valorPorHora * horasTrabalhadas;
				double impostoRenda = salarioBruto * 0.11;
				double inss = salarioBruto * 0.08;
				double sindicato = salarioBruto * 0.05;
				double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;

						System.out.print("Salario Bruto: "+ salarioBruto);
						System.out.print("Imposto de Renda: " + impostoRenda);
						System.out.print("INSS:"+ inss);
						System.out.print("Sindicato: "+ sindicato);
						System.out.print("Salario Liquido: "+ salarioLiquido);

	}

}
