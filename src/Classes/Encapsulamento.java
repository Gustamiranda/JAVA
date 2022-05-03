package Classes;

public class Encapsulamento {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
	
		cliente.setNome("Gustavo Miranda");
		cliente.setTelefone("27999999999");
		System.out.println("Nome cliente "+ cliente.getNome());
		System.out.println("Primeiro nome: "+ cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: "+ cliente.getUltimoNome());
	
	}
}
