import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioExcecao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double salario;
        Integer reajuste;
        Boolean continua = true;

        do {
            try {
                System.out.print("Digite o salário funcionário: R$ ");
                salario = scanner.nextDouble();

                System.out.print("Digite o reajuste do salário: ");
                reajuste = scanner.nextInt();

                try {
                    if (salario < 0) {
                        throw new Exception("Salário com valor negativo: Digite um salário valido");
                    }
                    if((reajuste< 0) || (reajuste >100)){
                        throw new Exception("Número do rejuste inválido: Digite um valor entre  0 a 100");
                    }
                } catch (Exception erro) {
                    System.out.println(erro);
                }

                Double resultado = salario + (salario * reajuste / 100);;
                System.out.printf("O salário R$ %.2f com o rejuste %d%% fica com R$ %.2f",salario,reajuste,resultado);
                continua = false;
            } catch (InputMismatchException erro)
            {
                System.out.println("Exceção:" + erro);
                scanner.nextLine(); // descarta o que deveria ter sido lido
                System.out.println("Digite um número válido");
            }
        } while (continua);


    }
}
