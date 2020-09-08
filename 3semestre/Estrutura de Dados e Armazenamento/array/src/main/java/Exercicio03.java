import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 10 números: ");
        Integer soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Número: ");
            numeros[i] = leitor.nextInt();
        }

        for (int i=0; i < numeros.length ; i++) {
            soma +=numeros[i];
        }

        System.out.println("Soma: " + soma);
    }
}
