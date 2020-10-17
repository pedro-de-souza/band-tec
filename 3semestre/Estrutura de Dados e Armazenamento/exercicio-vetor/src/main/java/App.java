import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] alunos = new String[10];
        Integer turma;
        String[] t1 = new String[10];
        String[] t2 = new String[10];
        Integer auxT1 = 0;
        Integer auxT2 = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno");
            System.out.print("- ");
            alunos[i] = leitor.next();

            System.out.println("Digite a turma que ele faz parte: (1/ 2)");
            turma = leitor.nextInt();

            if (turma.equals(1)) {
                t1[auxT1] = alunos[i];
                auxT1++;
            } else if (turma.equals(2)) {
                t2[auxT2] = alunos[i];
                auxT2++;
            }
        }


        System.out.println("\n\nTodos os alunos -");
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("\n" + (i + 1) + "º Aluno: " + alunos[i]);
        }

        System.out.println("\n\nTurma 1 -");
        for (int i = 0; i < auxT1; i++) {

            System.out.print("\n" + (i + 1) + "º Aluno: " + t1[i]);

        }

        System.out.println("\n\nTurma 2 -");
        for (int i = 0; i < auxT2; i++) {

            System.out.print("\n" + (i + 1) + "º Aluno: " + t2[i]);

        }
        System.out.println("\n=====================");

    }
}
