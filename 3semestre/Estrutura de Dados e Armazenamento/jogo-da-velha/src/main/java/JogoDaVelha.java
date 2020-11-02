import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoDaVelha {

    public static final String COLOR_YELLOW = "\u001B[33m";
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_RESET = "\u001B[0m";

    public static void exibi(Character[][] m) {
        System.out.println(COLOR_YELLOW+"\n\t  Jogo da Velha");
        System.out.printf("\n" +
                        "\t  _%c_|_%c_|_%c_\n" +
                        "\t  _%c_|_%c_|_%c_\n" +
                        "\t   %c | %c | %c \n"+COLOR_RESET,
                m[0][0], m[0][1], m[0][2],
                m[1][0], m[1][1], m[1][2],
                m[2][0], m[2][1], m[2][2]
        );
    }

    public static void reset(Character[][] m) {
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                m[l][c] = ' ';
            }
        }
    }

    public static Boolean haEmpate(Character[][] m) {
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                if (m[linha][coluna].equals(' ')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean haVencedor(Character[][] m, Character j) {

        Integer num = 3;
        Integer win = 0;

        for (int linha = 0; linha < m.length; linha++) {
            win = 0;
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                if (m[linha][coluna].equals(j)) {
                    win++;
                    if (win == 3) {
                        return true;
                    }
                }
            }
        }
        for (int coluna = 0; coluna < m[0].length; coluna++) {
            win = 0;
            for (int linha = 0; linha < m.length; linha++) {
                if (m[linha][coluna].equals(j)) {
                    win++;
                    if (win == 3) {
                        return true;
                    }
                }
            }
        }

        win = 0;
        for (int i = 0; i < num; i++) {
            if (m[i][i].equals(j)) {
                win++;
                if (win == 3) {
                    return true;
                }
            }
        }

        win = 0;
        for (int i = 0; i < 3; i++) {
            if (m[i][num - i - 1].equals(j)) {
                win++;
                if (win == 3) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void partida(Character[][] jogadas){

        Scanner scanner = new Scanner(System.in);
        Boolean acabou = false;

        Integer numJogadas = 1;

        reset(jogadas);
        exibi(jogadas);

        do {
            try {
                if (!haEmpate(jogadas)) {
                    Character quemTaJogado = numJogadas % 2 != 0 ? 'X' : 'O';//'X' representa o jogador1, 'O' representa o jogador2
                    System.out.printf("\nJogador %d - Faça sua jogada: \n", quemTaJogado == 'X' ? 1 : 2);
                    System.out.print("Digite a linha: ");
                    Integer linha = scanner.nextInt();

                    System.out.print("Digite a coluna: ");
                    Integer coluna = scanner.nextInt();

                    try {
                        if (linha > jogadas.length || coluna > jogadas[0].length) {
                            throw new ArrayIndexOutOfBoundsException("ESSA POSIÇÃO NÃO EXISTE. LEMBRE-SE QUE É UMA MATRIZ 3X3.");
                        } else if (!jogadas[linha - 1][coluna - 1].equals(' ')) {
                            throw new Exception("ESSE CAMPO JÁ ESTÁ OCUPADO. SELECIONE OUTRO CAMPO");
                        } else {
                            jogadas[linha - 1][coluna - 1] = quemTaJogado;
                            exibi(jogadas);
                            numJogadas++;

                            if (haVencedor(jogadas, 'X')) {//Jogador1 venceu?
                                System.out.println(COLOR_YELLOW +
                                        "\t ▄     ▄     ▄\n" +
                                        "\t █▄   ▄█▄   ▄█\n" +
                                        "\t ███▄▄███▄▄███\n" +
                                        "\t ▀█████▄█████▀\n" +
                                        "\t ▀▀▀▀▀▀▀▀▀▀▀▀▀\n" +
                                        "\t   JOGADOR 1\n" + COLOR_RESET
                                );
                                acabou = true;
                            } else if (haVencedor(jogadas, 'O')) {//Jogador2 venceu?
                                System.out.println(COLOR_YELLOW +
                                        "\t ▄     ▄     ▄\n" +
                                        "\t █▄   ▄█▄   ▄█\n" +
                                        "\t ███▄▄███▄▄███\n" +
                                        "\t ▀█████▄█████▀\n" +
                                        "\t ▀▀▀▀▀▀▀▀▀▀▀▀▀\n" +
                                        "\t   JOGADOR 2\n" + COLOR_RESET
                                );
                                acabou = true;
                            }
                        }
                    } catch (Exception error) {
                        System.out.println(COLOR_RED + "\n" + error + COLOR_RESET);
                    }
                }
                else{
                    System.out.println(COLOR_YELLOW +"\n\t    EMPATE \n"+COLOR_RESET);
                    acabou = true;
                }
            } catch (InputMismatchException error) {
                System.out.print(COLOR_RED + "\n" + error + ": SOMENTE VALORES NUMÉRICOS.\n" + COLOR_RESET);
                scanner.nextLine();//Vai para o próximo
            }
        } while (!acabou);
    }

    public static void main(String[] args) {

        Character[][] jogadas = new Character[3][3];
        partida(jogadas);

        Character resposta;
        do{
            System.out.print("DESEJA JOGAR NOVAMENTE? SIM[S] NÃO[N]: ");
            resposta = Character.toUpperCase(new Scanner(System.in).next().charAt(0));
            switch (resposta) {
                case 'S':
                    partida(jogadas);
                    break;
                case 'N':
                    System.out.println("\nFINALIZANDO PROGRAMA");
                    break;
                default:
                    System.out.println(COLOR_RED + "\nDIGITE UMA RESPOSTA VÁLIDA "+COLOR_RESET);
            }
        }while(resposta !='N');
    }
}
