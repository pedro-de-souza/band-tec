import java.util.Scanner;

public class Exercicio1 {

    public static boolean  buscarContato(String[][] c, String p){
        for(int linha=0; linha< c.length; linha++){
            if(p.equals(c[linha][0])){
                System.out.println("Numero: "+c[linha][1]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] contatos = new String[5][2];
        String pesquisar;

        for(int linha=0; linha< contatos.length; linha++){
            System.out.printf("\n%dº Contato\n", linha + 1);
            for (int coluna=0; coluna<contatos[linha].length; coluna++){
                String aux = (coluna == 0) ? "Nome: " : "Telefone: ";
                System.out.printf(aux);
                contatos[linha][coluna] = scanner.nextLine();
            }
        }
        System.out.print("\nBuscar contato: ");
        pesquisar = scanner.nextLine();

        if(!buscarContato(contatos, pesquisar)){
            System.out.println("Contato não existe");
        }
    }
}
