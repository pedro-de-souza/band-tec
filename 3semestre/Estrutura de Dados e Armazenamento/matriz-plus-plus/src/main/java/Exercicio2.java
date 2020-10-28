import java.util.Scanner;

public class Exercicio2 {

    public static void exibeBonitinho(Integer[][] m, Integer quant){
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + (coluna < (quant -1) ? ", ":""));
            }
            System.out.println();
        }
    }

    public static void exibeNum10a20(Integer[][] m){
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {

                if(m[linha][coluna]>=10 && m[linha][coluna]<=20){
                    System.out.print(m[linha][coluna] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static  void mediaPares(Integer[][] m){
        Integer soma = 0;
        Integer cont = 0;
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                if(m[linha][coluna] % 2==0){
                    soma = m[linha][coluna];
                    cont++;
                }
            }
        }
        System.out.print("Quantidade de pares que há na matriz: " + cont );
        if (cont>0){
            System.out.println("Média dos pares: " + soma/cont);
        }
    }
    public static void main(String[] args) {
//        Integer[][] matriz = { {1,12,13,7}, {15,5,16, 10} };
        Scanner scanner = new Scanner(System.in);
        Integer[][] matriz;

        System.out.print("\nDigite a quantidade de linhas da matriz: ");
        Integer linha = scanner.nextInt();

        System.out.print("Digite a quantidade de linhas da matriz: ");
        Integer coluna = scanner.nextInt();

        matriz = new Integer[linha][coluna];
        for(int l = 0; l < matriz.length; l++){
            System.out.printf("\n%dº Linha\n", l + 1);
            for (int c =0; c < matriz[l].length; c++){
                System.out.printf("Digite o valor da %dº coluna: ", c + 1);
                matriz[l][c] = scanner.nextInt();
            }
        }

        System.out.println();
        exibeBonitinho(matriz, matriz[0].length);
        exibeNum10a20(matriz);
        mediaPares(matriz);
    }
}
