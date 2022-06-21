package programacao_orientada_a_objetos._10_novidades_do_java_7._10_1_separador_de_digitos_literais;

public class ExemploSeparadorDigitosLiterais {

	public static void main(String[] args) {
		
		long populacaoSaoPaulo = 11_00_000L;
		long populacaoGrandeSaoPaulo = 11_00_000 + 9_000_000;
		
		System.out.printf("Popula��o S�o Paulo %d\n ", populacaoSaoPaulo);
		System.out.printf("Popula��o da Grande S�o Paulo ", populacaoGrandeSaoPaulo);
		
		double precoVeiculo = 200_000.99_10;
		System.out.printf("Pre�o va�culo: %.3f\n", precoVeiculo);
	
		// evitar usar assim
		int x = 1__2__3;
		int y = 1_2_3;
		
		System.out.printf("S�o iguais: %b\n", (x == y));
	}

}
