import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {


    public static Boolean repetir = true;
    public static Scanner scanner = new Scanner(System.in);


    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_YELLOW = "\u001B[33m";
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_RESET = "\u001B[0m";

    public static Boolean quadradoMagico(Integer[][] m, Integer num) {
        Integer[] somaLinha = new Integer[num];
        Integer[] somaColuna = new Integer[num];
        Integer somaDiagonalPrincipal = 0;
        Integer somaDiagonalSecundaria = 0;

        for (int linha = 0; linha < m.length; linha++) {
            Integer soma = 0;
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                soma += m[linha][coluna];
            }
            somaLinha[linha] = soma;
//            System.out.println("Soma da linha " +(linha+1)+ "º: " +somaLinha[linha]);
        }

        for (int coluna = 0; coluna < m[0].length; coluna++) {
            Integer soma = 0;
            for (int linha = 0; linha < m.length; linha++) {
                soma += m[linha][coluna];
            }
            somaColuna[coluna] = soma;
//            System.out.println("Soma da coluna " +(coluna+1)+ "º: " +somaLinha[coluna]);
        }

        for (int i = 0; i < num; i++) {
            somaDiagonalPrincipal += m[i][i];
        }
//        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

        for (int i = 0; i < num; i++) {
            somaDiagonalSecundaria += m[i][num - i - 1];
        }
//        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        if (somaDiagonalPrincipal == somaDiagonalSecundaria) {
            for (int i = 0; i < somaLinha.length; i++) {
                if (somaDiagonalPrincipal != somaLinha[i]) {
                    return false;
                }
            }
            for (int i = 0; i < somaColuna.length; i++) {
                if (somaDiagonalPrincipal != somaColuna[i]) {
                    return false;
                }
            }
            System.out.println(COLOR_YELLOW + "\n          Olha só, esse quadrado ai é");
            System.out.println(
                    "              ██╗ \n" +
                    "███╗   ███╗ █████╗ ██████╗ ██╗ ██████╗ ██████╗ \n" +
                    "████╗ ████║██╔══██╗██╔══██╗██║██╔════╝██╔═══██╗\n" +
                    "██╔████╔██║███████║██║  ██║██║██║     ██║   ██║\n" +
                    "██║╚██╔╝██║██╔══██║██║  ██║██║██║     ██║   ██║\n" +
                    "██║ ╚═╝ ██║██║  ██║██████╔╝██║╚██████╗╚██████╔╝\n" +
                    "╚═╝     ╚═╝╚═╝  ╚═╝╚═════╝ ╚═╝ ╚═════╝ ╚═════╝ "
            );
            System.out.println("✨✨✨✨✨✨✨✨✨✨✨ como você ✨✨✨✨✨✨✨✨✨✨✨" + COLOR_RESET);
            return true;
        }
        return false;
    }

    public static void validacao(Integer[][] m, Integer l, Integer c ) {
        do {
            try {
                System.out.printf("Digite o valor da %dº coluna: ", c + 1);
                m[l][c] = scanner.nextInt();
                repetir = false;
            } catch (InputMismatchException error) {
                System.out.print(COLOR_RED + "\n" + error + ": SOMENTE VALORES NUMÉRICOS. BURRO!\n" + COLOR_RESET);
                scanner.nextLine();
            }
        } while (repetir);
    }

    public static void main(String[] args) {
        Integer num = 3;
        Integer[][] matriz = new Integer[num][num];

        System.out.printf("\nPreencha a matriz[%d][%d]: ", num, num);
        for (int l = 0; l < matriz.length; l++) {
            System.out.printf("\n%dº Linha\n", l + 1);
            for (int c = 0; c < matriz[l].length; c++) {
                repetir = true;
                validacao(matriz,l,  c);
            }
        }
        System.out.println(COLOR_GREEN);
        Exercicio3.exibeBonitinho(matriz, matriz[0].length);
        System.out.println(COLOR_RESET);

        if (!quadradoMagico(matriz, num)) {
            System.out.println(COLOR_YELLOW + "\nSeu quadrado não é mágica" + COLOR_RESET);
        }
    }
}
