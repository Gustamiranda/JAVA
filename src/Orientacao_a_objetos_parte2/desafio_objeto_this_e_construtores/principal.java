package Orientacao_a_objetos_parte2.desafio_objeto_this_e_construtores;

public class principal {

	public static void main(String[] args) {
		
		fornecedor imobiliaria = new fornecedor();
		imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");
		fornecedor mercado = new fornecedor();
		mercado.setNome("Mercado do Jo�o");

		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Tri�ngulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunica��es");

		// instanciando contas a pagar
		ContaAPagar contaPagar1 = new ContaAPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setfornecedor(imobiliaria);

		ContaAPagar contaPagar2 = new ContaAPagar(mercado, "Compras do m�s", 390d, "19/05/2012");

		//instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de log�stica em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);

		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manuten��o em sistema de conta online",
			53200d, "13/05/2012");

		//pagamento e cancelamento de contas a pagar
		contaPagar1.pagar();
		contaPagar2.cancelar();

		//Recebimento e cancelamento de contas a receber
		contaReceber1.receber();
		contaReceber2.cancelar();
	}


}
