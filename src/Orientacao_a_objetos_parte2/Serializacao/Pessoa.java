package Orientacao_a_objetos_parte2.Serializacao;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int idade;
	private String profissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
