import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void exibeBonitinho(Integer[][] m, Integer quant){
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + (coluna < (quant -1) ? ", ":""));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean repetir = true;
        Integer num = 0;
        Integer[][] matriz;

        do {
            try {
                System.out.print("Digite um número: ");
                num = scanner.nextInt();
                try {
                    if (num < 1 || num > 6) {
                        throw new Exception("Somente valores entre 1 e 6");
                    }
                    repetir = false;
                } catch (Exception error) {
                    System.out.println("\n" + error);
                }

            } catch (InputMismatchException error) {
                System.out.print("\n" + error + ": Falei UM NÚMERO O BURRO\n");
                scanner.nextLine();//Vai para o próximo
            }
        } while (repetir);

        matriz = new Integer[num][num];

        System.out.println("Agora preencha a matriz: ");
        for(int l = 0; l < matriz.length; l++){
            System.out.printf("\n%dº Linha\n", l + 1);
            for (int c =0; c < matriz[l].length; c++){
                System.out.printf("Digite o valor da %dº coluna: ", c + 1);
                matriz[l][c] = scanner.nextInt();
            }
        }
        System.out.println();
        exibeBonitinho(matriz, matriz[0].length);

        Integer somaDiagonalPrincipal = 0;
        for(int i = 0; i < num ; i++){
            somaDiagonalPrincipal+= matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

        Integer somaDiagonalSecundaria = 0;
        for(int i = 0; i < num ; i++){
            somaDiagonalSecundaria+= matriz[i][num - i - 1];
        }
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

    }
}
