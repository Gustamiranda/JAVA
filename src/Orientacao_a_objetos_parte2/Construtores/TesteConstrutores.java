package Orientacao_a_objetos_parte2.Construtores;

public class TesteConstrutores {

	public static void main(String[] args) {

		pessoa p1 = new pessoa("João", 13);

		System.out.print("Nome: " + p1.nome + "\nIdade: " + p1.idade);
	}

}
