package Orientacao_a_objetos_parte2.Calculadora;

public enum OperacaoAritmetica {
	ADICAO {
		public int operacao(int x, int y) {
			return x + y;
		}
	},

	SUBTRACAO {
		public int operacao(int x, int y) {
			return x - y;
		}
	};

	public abstract int operacao(int x, int y);
}
