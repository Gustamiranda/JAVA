package Classes;

public class Pedido {

	Byte codigo;
	Double subtotal;
	Double desconto;
	Double total;

	public Byte getCodigo() {
		return codigo;
	}

	public void setCodigo(Byte código) {
		this.codigo = código;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return total-subtotal;
	}

	public void setTotal(Double total) {
		// Não é mais necessário	
		}

}
