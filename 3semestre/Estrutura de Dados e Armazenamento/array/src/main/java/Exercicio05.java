import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] carros = new String[5];
        Double[] consumoCarros = new Double[5];
//        Double menor = 0.0;

        System.out.println("Digite 5 marcas de carro: ");
        for(int i = 0; i < carros.length; i++){
            System.out.print("- ");
            carros[i] = leitor.nextLine();
        }

        System.out.println("Digite o consumo de cada carro de digitou: ");
        for(int i = 0; i < consumoCarros.length; i++){
            System.out.print("- ");
            consumoCarros[i] = leitor.nextDouble();
        }

        int index = 0;
        Double menor = consumoCarros[0];
        for (int i = 0 ; i < consumoCarros.length;i++) {
            if (consumoCarros[i] < menor) {
                menor = consumoCarros[index];
                index = i;
            }
        }

        System.out.println(carros[index]+" é o mais econômico rodando com "+ consumoCarros[index]+" litros");

    }
}
