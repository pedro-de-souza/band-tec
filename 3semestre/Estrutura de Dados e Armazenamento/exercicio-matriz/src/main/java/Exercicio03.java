public class Exercicio03 {
    public static void main(String[] args) {
        int[][] matriz = { {2,1,1}, {2,2,2}, {5,3,3} };
        Exercicio01.exibeMatriz(matriz);
        System.out.println("---------");
        somaMatrizColuna(matriz);
    }
    public static void somaMatrizColuna(int[][] m){
        int[][] somaColunaMatriz = new int[1][3];
        for(int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                somaColunaMatriz[0][coluna] += m[linha][coluna];
            }
        }
        Exercicio01.exibeMatriz(somaColunaMatriz);
    }
}
