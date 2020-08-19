import java.util.Scanner;
public class TestaCarrinho {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Scanner leitorNumber = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        String nome,autor, isbn,gravadora, descricao;
        Integer codigo, quantHoras;
        Double precoCusto, valorHora;

        Boolean fim = true;

        do{

            System.out.println("________________________");
            System.out.println("-- Loja do Marquinhos --");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar serviço");
            System.out.println("4. Exibir itens do carrinho");
            System.out.println("5. Exibir total de venda");
            System.out.println("6. Fim\n");

            System.out.print("Digite uma opção: ");
            Integer opcao  = leitorNumber.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nAdicionando um livro");

                    System.out.print("Digite o código: ");
                    codigo = leitorNumber.nextInt();
                    System.out.print("Digite o nome: ");
                    nome = leitorString.nextLine();
                    System.out.print("Digite o autor: ");
                    autor = leitorString.nextLine();
                    System.out.print("Digite o preço: R$ ");
                    precoCusto = leitorNumber.nextDouble();
                    System.out.print("Digite o isbn: ");
                    isbn = leitorString.nextLine();

                    //System.out.println(codigo +", "+nome+", "+autor+", "+precoCusto+", "+isbn);
                    carrinho.adicionarVendavel(new Livro(codigo,nome,precoCusto,autor,isbn));

                    break;
                case 2:
                    System.out.println("\nAdicionando um DVD");

                    System.out.print("Digite o código: ");
                    codigo = leitorNumber.nextInt();
                    System.out.print("Digite o nome: ");
                    nome = leitorString.nextLine();
                    System.out.print("Digite o gravadora: ");
                    gravadora = leitorString.nextLine();
                    System.out.print("Digite o preço: R$ ");
                    precoCusto = leitorNumber.nextDouble();

                    //System.out.println(codigo +", "+nome+", "+gravadora+", "+precoCusto);
                    carrinho.adicionarVendavel(new DVD(codigo,nome,precoCusto,gravadora));
                    break;
                case 3:
                    System.out.println("\nAdicionando um Serviço");

                    System.out.print("Digite o código: ");
                    codigo = leitorNumber.nextInt();
                    System.out.print("Digite a descrição: ");
                    descricao = leitorString.nextLine();
                    System.out.print("Digite a quantidade de hora: ");
                    quantHoras = leitorString.nextInt();
                    System.out.print("Digite o preço: R$ ");
                    valorHora = leitorNumber.nextDouble();

                    //System.out.println(descricao +", "+codigo+", "+quantHoras+", "+valorHora);
                    carrinho.adicionarVendavel(new Servico(descricao,codigo,quantHoras,valorHora));

                    break;
                case 4:
                    System.out.println("\nLista dos itens do carrinho:\n");
                    carrinho.exibiIntsCarrinho();
                    System.out.println("---------------------------\n");
                    break;
                case 5:
                    System.out.println("\nLista de total de venda:\n");
                    if(carrinho.calculaTotalVenda() == 0.0){
                        System.out.println(" Está vazia");
                    }else{
                        System.out.format("R$  %.2f",carrinho.calculaTotalVenda());
                    }
                    System.out.println("---------------------------\n");
                    break;
                case  6:
                    System.out.println("Saindo do sistema...");
                    fim = false;
                    break;
                default:
                    System.err.println("\nDigite uma opção válida:\n");
            }

        }while(fim);
    }


}
