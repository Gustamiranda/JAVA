package programacao_orientada_a_objetos;

public class segundaClasse {

	public static void main(String[] args) {

		produto02 produto02 = new produto02();

		produto02.nome = "smartphone";
		produto02.quantidade = 8;

		System.out.print(
				"Necessário repor estoque do produto " + produto02.nome + "? " + produto02.eNecessarioReporOEstoque());
	}

}
