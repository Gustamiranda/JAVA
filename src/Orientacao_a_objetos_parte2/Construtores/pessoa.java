package Orientacao_a_objetos_parte2.Construtores;

public class pessoa {
	String nome;
	int idade;

	public pessoa(String nome) {

		this.nome = nome;
	}

	public pessoa(String nome, int idade) {

		this(nome);
		this.idade = idade;
	}
}
