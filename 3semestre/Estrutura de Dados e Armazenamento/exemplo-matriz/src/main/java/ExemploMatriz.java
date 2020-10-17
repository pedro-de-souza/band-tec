import java.util.Scanner;

public class ExemploMatriz {

    public static void exibiMatriz(Integer[][] m){
        for (int linha = 0;linha < m.length; linha++){
            for(int coluna = 0; coluna < m[linha].length; coluna++){
                System.out.print(m[linha][coluna]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] vetor = new Integer[10];

        Integer[][] matriz = new Integer[3][4];

        Integer[][] matriz2 = {{1,2},{3,4},{5,6},{7,8}};

        Integer[][] matrizLoka = { {1}, {2,3,4,5}, {6,7}, {8,9,10} };


        for (int linha = 0;linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Digite o valor de matriz["+ linha+"]"+
                        "["+coluna+"]");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        exibiMatriz(matriz);
        System.out.println();
        exibiMatriz(matriz2);
        System.out.println();
        exibiMatriz(matrizLoka);
    }

    public static void exbibiMatrizTransposta(int[][] m){
        for (int coluna = 0;coluna < m[0].length; coluna++){
            for(int linha = 0; linha < m.length;  linha++){
                System.out.print(m[linha][coluna]+"\t");
            }
            System.out.println();
        }
    }

}
