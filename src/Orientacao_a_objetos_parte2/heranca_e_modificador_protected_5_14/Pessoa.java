package Orientacao_a_objetos_parte2.heranca_e_modificador_protected_5_14;

public class Pessoa {
	String nome;
	protected int idade;

	public void seApresentar() {
		System.out.print("Olá, eu sou " + nome + ", e tenho " + idade + " anos.");
	}
}
