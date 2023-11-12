package aula;

import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes a serem gerados: ");
        int qntNomes = sc.nextInt();


        Edit ler = new Edit();

        String fileName = "nome.txt";
        String fileSobreName = "sobrenomes.txt";
        String fileContent = ler.Read(fileName);
        String fileSubContent = ler.Read(fileSobreName);

        String gerador = ler.gerarNome(fileContent, qntNomes, fileSubContent);
        System.out.println(gerador);


    }
}
