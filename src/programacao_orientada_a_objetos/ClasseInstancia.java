package programacao_orientada_a_objetos;

public class ClasseInstancia {

	public static void main(String[] args) {

		System.out.println("Quantidade minima estoque " + produto.quantidade_Minima);

		produto produto = new produto();
		produto.nome = "Caneca";

		produto produto2 = new produto();
		produto.nome = "Carteira";

		System.out.println("Quantidade minima estoque: " + produto.quantidade_Minima);

		Impressao.Informacao("Produto 1: " + produto.nome);
	}

}
