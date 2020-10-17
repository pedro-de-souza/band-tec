import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];


        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz[" + linha+ "]" +
                        "[" + coluna + "]");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        exibeMatriz(matriz);
    }
    public static void exibeMatriz(int[][] m) {
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
