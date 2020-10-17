import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Integer[] vetor1 = new Integer[5];
        Integer[] vetor2 = new Integer[5];
        Integer[] vetor3 = new Integer[10];
        Integer ordenar;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 5 números  para o primeiro vetor: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("- ");
            vetor1[i] = leitor.nextInt();
        }

        System.out.println("\nDigite 5 números  para o segundo vetor: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("- ");
            vetor2[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetor1.length; i++) {
            for (int a = i + 1; a < vetor1.length; a++) {
                if (vetor1[i] > vetor1[a]) {
                    ordenar = vetor1[i];
                    vetor1[i] = vetor1[a];
                    vetor1[a] = ordenar;
                }
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
            for (int a = i + 1; a < vetor2.length; a++) {
                if (vetor2[i] > vetor2[a]) {
                    ordenar = vetor2[i];
                    vetor2[i] = vetor2[a];
                    vetor2[a] = ordenar;
                }
            }
        }

        System.out.println(Arrays.toString(vetor1));
        System.out.println(Arrays.toString(vetor2));

    }
}
