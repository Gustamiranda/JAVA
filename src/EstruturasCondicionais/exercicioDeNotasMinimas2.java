package EstruturasCondicionais;

import javax.swing.JOptionPane;

public class exercicioDeNotasMinimas2 {

	/*
	 * * Crie um programa que vai receber as notas que uma pessoa tirou nas duas
	 * materias de sua prova. SerÃ£o dois parÃ¢metros para receber. um para receber
	 * a nota de portuguÃªs e outro para receber as de matemÃ¡tica. A prova, no
	 * total, vale 200 pontos - 100 para cada matÃ©ria. A nota mÃ­nima total para
	 * passar Ã© igual ou maior que 150. Entretanto, o candidato nÃ£o pode tirar
	 * menos do que 60 pontos em qualquer uma das duas matÃ©rias, ou seja, se tirar
	 * 59 em portuguÃªs e 100 em matemÃ¡tica (totalizando uma nota maior do que o
	 * total necessÃ¡rio que Ã© 150) ele nÃ£o conseguirÃ¡ a vaga. No final mostre
	 * para o candidato se ele conseguiu ou nÃ£o.
	 */

	static final double NOTA_MINIMA_DE_PORTUGUES = 60;
	static final double NOTA_MINIMA_DE_MATEMATICA = 60;
	static final double NOTA_MINIMA_DO_TOTAL = 150;

	public static void main(String[] args) {

		double notaDePortugues = perguntaNotaDePortugues();
		double notaDeMatematica = perguntaNotadeDeMatematica();
		boolean obteveNotaMinimaPorMateria = validaNotaMinimaPorMateria(notaDePortugues, notaDeMatematica);
		double somaTotalDasNotas = somaTotalDasNotas(notaDeMatematica, notaDePortugues);
		boolean obteveMinimaTotal = validaMinimaTotal(somaTotalDasNotas);
		boolean obteveNotasSuficientes = validaNotasSuficientes(obteveNotaMinimaPorMateria, obteveMinimaTotal);
		exibeResultado(notaDePortugues, notaDeMatematica, obteveNotasSuficientes, somaTotalDasNotas);
	}

	static double perguntaNotaDePortugues() {
		return Double.parseDouble(JOptionPane.showInputDialog(
				"CALCULE SUAS NOTAS DE PORTUGUï¿½S E MATEMATICA \n\n\nDIGITE SUA NOTA DE PORTUGUï¿½S:"));
	}

	static double perguntaNotadeDeMatematica() {
		return Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA NOTA DE MATEMATICA:"));
	}

	static double somaTotalDasNotas(double notaDePortugues, double notaDeMatematica) {
		return notaDeMatematica + notaDePortugues;
	}

	static boolean validaNotaMinimaPorMateria(double notaDePortugues, double notaDeMatematica) {
		return notaDePortugues >= NOTA_MINIMA_DE_PORTUGUES || notaDeMatematica >= NOTA_MINIMA_DE_MATEMATICA;
	}

	static boolean validaMinimaTotal(double somaTotal) {
		return somaTotal >= NOTA_MINIMA_DO_TOTAL;
	}

	static boolean validaNotasSuficientes(boolean obteveNotaMinimaPorMateria, boolean obteveMinimaTotal) {
		return obteveMinimaTotal && obteveNotaMinimaPorMateria;
	}

	static void exibeResultado(double notaDePortugues, double notaDeMatematica, boolean obteveNotasSuficientes,
			double somaTotal) {
		if (obteveNotasSuficientes) {
			JOptionPane.showMessageDialog(null, "PARABÃ‰NS VOCÃŠ PONTUOU " + somaTotal + ". ESTÃ� APROVADO!");
		} else {
			JOptionPane.showMessageDialog(null, "INFELIZMENTE VOCÃŠ NÃƒO ATINGIU A NOTA MINIMA PARA SER APROVADO.");
		}
	}
}