package EstruturasCondicionais;

import java.util.Scanner;

public class estruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;

//			Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficenteDeAbertura = true;
		Boolean temNomeLimpo = true;

//			Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
//					&& aContaTemTempoSuficenteDeAbertura && temNomeLimpo;

		if (((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficenteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! Pode liberar empr�stimo.");
		} else {
			System.out.println("N�o pode liberar o empr�stimo.");
		}
	}
}
