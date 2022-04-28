package programacao_orientada_a_objetos;

public class produto02 {
	Integer quantidade_Minima = 10;
	String nome;
	Integer quantidade;
	
	boolean eNecessarioReporOEstoque() {
		
		return quantidade < quantidade_Minima;
	}
}
