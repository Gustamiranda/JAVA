package programacao_orientada_a_objetos._9_serializacao_de_objetos._9_1_salvando_e_lendo_objetos_em_arquivo;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializandoObjeto {

    public static void main(String[] args) throws FileNotFoundException {
        Pessoa p = new Pessoa();
        p.setNome("João Silva");
        p.setIdade(25);
        p.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("joao.obj")))) {
            out.writeObject(p);
            System.out.println("Objeto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro salvando o objeto. " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
© 2022 GitHub, Inc.
Terms
Privacy
Security
St