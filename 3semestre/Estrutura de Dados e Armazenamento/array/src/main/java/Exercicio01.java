import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer[] vetor = new Integer[7];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um valor "+(i+1)+" do veotr");
            vetor[i] = leitor.nextInt();
        }

        for(int i = vetor.length - 1;i >= 0 ; i--){
            System.out.print("\nVator["+i+"] = "+ vetor[i]+"; \t");
        }

        for(int i = 0; i < vetor.length;i ++){
            System.out.print("\nVator["+i+"] = "+ vetor[i]+"; \t");
        }


    }
}
