public class Exercicio02 {
    public static void main(String[] args) {
        int[][] matriz1 = { {2,4,6}, {1,3,5} };
        int[][] matriz2 = { {2,4,6}, {1,3,5} };
        somaMatriz(matriz1,matriz2);
    }
    public static void somaMatriz(int[][] m1, int[][] m2){
        int[][] matrizSoma = new int[2][3];
        for(int linha = 0; linha < matrizSoma.length; linha++) {
            for (int coluna = 0; coluna < matrizSoma[linha].length; coluna++) {
                matrizSoma[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
            }
        }
        Exercicio01.exibeMatriz(matrizSoma);
        System.out.println("\n");
    }
}
