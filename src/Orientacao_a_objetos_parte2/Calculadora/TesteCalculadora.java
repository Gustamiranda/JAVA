package Orientacao_a_objetos_parte2.Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;
		int resultado1 = o1.operacao(5, 3);
		System.out.println("O resultado �: " + resultado1);
		OperacaoAritmetica o2 = OperacaoAritmetica.SUBTRACAO;
		int resultado2 = o2.operacao(5, 3);
		System.out.println("O resultado �: " + resultado2);

	}

}
