import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Integer[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner leitor = new Scanner(System.in);
        Integer dia;
        Integer mes;

        System.out.print("Digite um dia: ");
        dia = leitor.nextInt();

        System.out.print("Digite número do mês: ");
        mes = leitor.nextInt();

        Integer totalDias = dia;
        for(int i = 0; i < mes - 1; i++){
            totalDias += diasMes[i];
        }
        System.out.println("O dia "+dia+"/"+mes+" corresponde ao dia "+totalDias+" do ano");
    }
}
