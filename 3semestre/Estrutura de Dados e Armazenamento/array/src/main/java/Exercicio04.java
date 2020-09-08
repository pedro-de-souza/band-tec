import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Integer[] numeros = new Integer[10];
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 10 números: ");
        Integer soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Número: ");
            numeros[i] = leitor.nextInt();
        }

        System.out.print("Digite um número: ");
        Integer numero = leitor.nextInt();

        Integer cont = 0;
        for(int i = 0; i < numeros.length ; i++){
            if(numeros[i] == numero){
                cont++;
            }
        }

        System.out.println("O número " + numero+ " ocorre "+ cont +" vezes");


    }

}
