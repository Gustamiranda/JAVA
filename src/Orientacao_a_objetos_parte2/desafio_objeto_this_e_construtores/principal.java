package Orientacao_a_objetos_parte2.desafio_objeto_this_e_construtores;

public class principal {

	public static void main(String[] args) {
		
		fornecedor imobiliaria = new fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		fornecedor mercado = new fornecedor();
		mercado.setNome("Mercado do João");
		ContaAPagar conta1 = new ContaAPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataDeVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		
		ContaAPagar conta2 = new ContaAPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		ContaAPagar conta3 = new ContaAPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();
	}

}
