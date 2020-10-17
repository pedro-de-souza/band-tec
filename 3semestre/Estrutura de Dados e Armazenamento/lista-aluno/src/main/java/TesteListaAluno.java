import java.util.Scanner;

public class TesteListaAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerNome = new Scanner(System.in);

        Boolean fim = false;

        Integer ra;
        String nome;
        Double nota;

        ListaObj<Aluno> lista = new ListaObj<Aluno>(10);

        while(!fim){
            System.out.println("\n -------Sistema Aluno------- ");
            System.out.println(" 1º - Adiconar um aluno");
            System.out.println(" 2º - Exibir a lista");
            System.out.println(" 3º - Exibir um aluno da lista");
            System.out.println(" 4º - Gravar lista num arquivo txt");
            System.out.println(" 5º - Gravar lista num arquivo cvs");
            System.out.println(" 6º - Ler e exibir arquivo txt");
            System.out.println(" 7º - Ler e exibir arquivo cvs");
            System.out.println(" 8º - Limpar a lista");
            System.out.println(" 9º - Fim");
            System.out.print(" - Escolha alguma opção: ");
            Integer opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n -- Adicionando um aluno -- ");
                    System.out.print(" Digite o ra do aluno: ");
                    ra = scanner.nextInt();
                    System.out.print(" Digite o nome do aluno: ");
                    nome = scannerNome.nextLine();
                    System.out.print(" Digite a nota do aluno: ");
                    nota = scanner.nextDouble();

                    lista.adicionar(new Aluno(ra,nome,nota));

                    break;
                case 2:
                    lista.exibi();
                    break;
                case 3:
                    System.out.println("\n -- Exibir um aluno da lista -- ");
                    System.out.print(" Digite o índice do aluno: ");
                    Integer i = scanner.nextInt();

                    if(lista.getElemento(i) == null){
                        System.out.println(" - Índice inválido!\n");
                        return;
                    }
                    System.out.println(lista.getElemento(i));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("\nOpção a ser implementada");
                    break;
                case 8:
                    lista.limpar();
                    System.out.println("\n - Lista limpa");
                    break;
                case 9:
                    fim = true;
                    break;
                default:
                    System.out.println("\n - Opção Inválida!");
            }


        }

    }
}
