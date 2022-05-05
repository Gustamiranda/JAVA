package Leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> listaDeTarefas = new ArrayList<>();

		String tarefas;
		int i = 0;

		while (true) {
			System.out.println("Informe uma tarefo ou  x para parar: ");
			tarefas = scanner.nextLine();

			if ("x".equals(tarefas)) {
				break;
			}
			listaDeTarefas.add(tarefas);
			i++;

		}

		escreverNoArquivo("C:\\Users\\aluno.LABCETEC\\Desktop.arquivo.txt", listaDeTarefas);

		scanner.close();
	}

	private static void escreverNoArquivo(String arquivo, ArrayList<String> listaDeTarefas) throws IOException {
		
		Path path = Paths.get(arquivo);
		Files.write(path, listaDeTarefas);
	}

}