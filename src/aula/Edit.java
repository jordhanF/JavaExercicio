package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Edit {

    public String Read(String fileName) {


        StringBuilder conteudo = new StringBuilder();
        try {

            String linha;
            FileReader arq = new FileReader(fileName);
            BufferedReader lerArq = new BufferedReader(arq);
            linha = lerArq.readLine();

            while (linha != null){
                conteudo.append(linha).append("\n");
                linha = lerArq.readLine();
            }

            arq.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível ler o arquivo: " + ex.getMessage());
        }

        return conteudo.toString();
    }

    public static String obterNomeAleatorio(String[] nomes) {
        Random random = new Random();
        int index = random.nextInt(nomes.length);
        return nomes[index];
    }

    public String gerarNome(String fileContent, int qntNomes, String fileSubContent) {

        StringBuilder novosNomes = new StringBuilder();

        String[] nomesArray = fileContent.split(";");
        String[] sobreNomesArray = fileSubContent.split(";");

        for (int i = 0; i < qntNomes; i++) {
            String nomeAleatorio = obterNomeAleatorio(nomesArray);
            String sobreNomeAleatorio = obterNomeAleatorio(sobreNomesArray);

            novosNomes.append(nomeAleatorio).append(" ").append(gerarCaracter()).append(". ").append(sobreNomeAleatorio).append(": ").append(gerarIdade());

        }

        return novosNomes.toString();
    }

    public int gerarIdade(){

        Random rd = new Random();
        int n;
        n = rd.nextInt(1, 100);
        return n;
    }

    public static String gerarCaracter() {

        String caractere = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String[] caracteres = caractere.split(" ");

        Random random = new Random();
        int index = random.nextInt(caracteres.length);

        return caracteres[index];
    }

}
