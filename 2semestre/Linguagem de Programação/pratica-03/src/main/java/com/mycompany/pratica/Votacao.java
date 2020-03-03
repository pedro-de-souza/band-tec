/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author pedro.souza
 */
public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer voto, votoMussarela = 0, votoCalabresa = 0, votoQueijos = 0;
        System.out.println("Escolha o sabor de pizza favorito.");

        System.out.println("5 - Mussarela\n25 - Calabresa \n50 - Quatro queijos");
        for (Integer cont = 1; cont<=10; cont++) {
            System.out.print(cont+"° voto. Escolha seu sabor favorito: ");
            voto = leitor.nextInt();

            switch (voto) {
                case 5:
                    votoMussarela++;
                    break;
                case 25:
                    votoCalabresa++;
                    break;
                case 50:
                    votoQueijos++;
                    break;
                default:
                    System.out.println("\nSomente valores corresponte a cada produto");
                    cont--;
                    break;
            }
        }
        System.out.println("10 Votos:");
        System.out.println("5 - Mussarela: " + votoMussarela
                + " votos\n25 - Calabresa: " + votoCalabresa
                + " votos \n50 - Quatro queijos: " + votoQueijos + "votos");
        if (votoMussarela > votoCalabresa || votoMussarela < votoCalabresa || votoMussarela > votoQueijos || votoMussarela < votoQueijos) {
            System.out.print("\nO vencedor é ");
            if (votoMussarela > votoCalabresa && votoMussarela > votoQueijos) {
                System.out.println("Mussarela");
            } else if (votoCalabresa > votoQueijos) {
                System.out.println("calabresa");
            } else {
                System.out.println("Quatro queijos");
            }
        } else {
            if (Objects.equals(votoCalabresa, votoQueijos)
                    || Objects.equals(votoMussarela, votoCalabresa) || Objects.equals(votoMussarela, votoQueijos)) {
                System.out.print("\nOcorreu um empate ");
                if (Objects.equals(votoMussarela, votoCalabresa)) {
                    System.out.print("entre Mussarela e Calabresa");
                } else if (Objects.equals(votoCalabresa, votoQueijos)) {
                    System.out.print("entre Calabresa e Quatro queijos");
                } else {
                    System.out.print("entre Mussarela e Quatro queijos");
                }

            }

        }
    }
}
