package modificador_de_acesso_default;

public class TreinadorCachorro {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		DonoCachorro donoCachorro = new DonoCachorro();
		donoCachorro.ensinarCachorroSentar(cachorro);
	}
}
