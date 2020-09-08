import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 10 nomes: ");

        for(int i = 0; i < nomes.length; i++){
            System.out.print("Nome: ");
            nomes[i] = leitor.nextLine();
        }

        System.out.print("Digite um dos nomes inseridos na lista: ");
        String nome = leitor.nextLine();

        for(int i = 0; i < nomes.length ; i++){
            if(nomes[i].equals(nome)){
                System.out.println("Nome encontrado no indice "+ i);
                return;
            }
        }
        System.out.println("Nome não encontrado");

    }
}
