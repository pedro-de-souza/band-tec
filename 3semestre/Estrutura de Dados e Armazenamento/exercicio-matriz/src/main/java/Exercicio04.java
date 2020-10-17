import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer maxAluno = 0;

        Boolean repetir = true;

        while (repetir) {

            try {

                System.out.print("Digite a quantidade de aluno: ");
                maxAluno = scanner.nextInt();

                try {
                    if (maxAluno < 5 || maxAluno > 15) {
                        throw new Exception("ERRO : Somente valores entre 5 e 15");
                    }
                    repetir = false;
                } catch (Exception error) {
                    System.out.println(error);
                }

            } catch (InputMismatchException error) {
                System.out.println("Exceção:" + error);
                scanner.nextLine();
                System.out.println("Digite um número válido");
            }

        }

        String[] nomesAlunos = new String[maxAluno];
        Double[][] notasAlunos = new Double[maxAluno][2];
        Double[] mediaAlunos = new Double[2];


        System.out.printf("Digite o nome dos %d alunos.\n", maxAluno);
        for (int i = 0; i < maxAluno; i++) {
            System.out.printf("%dº - ", i + 1);
            nomesAlunos[i] = new Scanner(System.in).nextLine();
        }
        for (int linha = 0; linha < notasAlunos.length; linha++) {
            System.out.printf("\nDigite as notas do %dº aluno.\n", linha + 1);
            for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
                System.out.printf("Nota AC%d - ", coluna + 1);
                notasAlunos[linha][coluna] = scanner.nextDouble();
            }
        }


        for (int coluna = 0; coluna < notasAlunos[0].length; coluna++) {
            Double total = 0.0;
            for (int linha = 0; linha < notasAlunos.length; linha++) {
                total += notasAlunos[linha][coluna];
            }
            mediaAlunos[coluna] = total / notasAlunos.length;
        }

        System.out.printf("\n%-22s%9s%10s", "NOME DO ALUNO", "NOTA AC1", "NOTA AC2");
        System.out.println("\n---------------------.---------.---------");

        for (int i = 0; i < maxAluno; i++) {
            System.out.printf("%-22s%9.1f%10.1f\n", nomesAlunos[i], notasAlunos[i][0], notasAlunos[i][1]);
        }

        System.out.printf("\n%-22s%9.1f%10.1f\n", "MÉDIA:", mediaAlunos[0], mediaAlunos[1]);


    }
}
