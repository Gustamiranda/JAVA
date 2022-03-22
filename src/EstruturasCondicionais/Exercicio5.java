package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio5 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double[] notas = new double[2];

		int somaDasNotas = 0;
		for (int c = 0; c < notas.length; c++) {

			System.out.print("Informe o " + (c + 1) + "° Numero: ");
			notas[c] = scanner.nextInt();

			somaDasNotas += notas[c];
		}
		double mediaDasNotas = calcularMedia(somaDasNotas);

		boolean alunoAprovado = aprovar(mediaDasNotas);
		boolean alunoReprovado = reprovar(mediaDasNotas);
		boolean alunoAprovadoComDistincao = aprovarComDistincao(mediaDasNotas);

		exibirResultado(alunoAprovado, alunoReprovado, alunoAprovadoComDistincao, mediaDasNotas);
	}

	public static double calcularMedia(double somaDasNotas) {

		return somaDasNotas / 2;
	}

	public static boolean aprovar(double mediaDasNotas) {

		return mediaDasNotas >= 7 && mediaDasNotas < 10;
	}

	public static boolean reprovar(double mediaDasNotas) {

		return mediaDasNotas < 7;
	}

	public static boolean aprovarComDistincao(double mediaDasNotas) {

		return mediaDasNotas == 10;
	}

	public static void exibirResultado(boolean alunoAprovado, boolean alunoReprovado, boolean alunoAprovadoComDistincao,
			double mediaDasNotas) {

		if (alunoAprovado) {
			System.out.print("Media: " + mediaDasNotas + "\n");
			System.out.print("Aluno aprovado");
		} else if (alunoReprovado) {
			System.out.print("Media: " + mediaDasNotas + "\n");
			System.out.print("Aluno reprovado");

		} else if (alunoAprovadoComDistincao) {
			System.out.print("Media: " + mediaDasNotas + "\n");
			System.out.print("Aluno aprovado com distinção");
		} else {
			System.out.print("Valores invalidos");
		}
	}
}
