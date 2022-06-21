package programacao_orientada_a_objetos._9_serializacao_de_objetos._9_1_salvando_e_lendo_objetos_em_arquivo;

import programacao_orientada_a_objetos._9_serializacao_de_objetos._9_1_salvando_e_lendo_objetos_em_arquivo.model.Pessoa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeserializandoObjeto {

    public static void main(String[] args) throws FileNotFoundException {
        try (ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("joao.obj")))){
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissão: " + p.getProfissao());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro convertendo para a classe Pessoa");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}