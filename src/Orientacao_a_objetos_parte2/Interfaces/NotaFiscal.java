package Orientacao_a_objetos_parte2.Interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {

	private int numero;

	public NotaFiscal(int numero) {
		this.numero = numero;
	}

	public void adicionarPedido(String produto) {
	}

	public void imprimir() {
		System.out.println("Vamos imprimir essa nota fiscal de numero: " + numero);
	}

	public void enviar(String email) {
		System.out.println("Enviando a nota de numero: " + numero + " para o email: " + email + ".");
	}
}
