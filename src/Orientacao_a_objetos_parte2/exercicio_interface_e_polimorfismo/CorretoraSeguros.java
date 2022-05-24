package Orientacao_a_objetos_parte2.exercicio_interface_e_polimorfismo;

public class CorretoraSeguros {
	public void fazerPropostaSegura(Seguravel objetoSeguravel) {

		System.out.println("\n-------------------------------");
		System.out.println("Corretora de Seguros - Proposta");
		System.out.println("\n-------------------------------");
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorApolice());
		System.out.println("-------------------------------\n");
	}
}
