import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        blackjack carta1 = blackjack.cartas(), carta2 = blackjack.cartas();
        String nomeJogador1, nomeJogador2;

        Scanner teclado = new Scanner(System.in);

        System.out.printf("\nBLACKJACK\n");

        System.out.printf("\nInsira o nome do jogador 1: ");
        nomeJogador1 = teclado.nextLine();

        System.out.printf("\nInsira o nome do jogador 2: ");
        nomeJogador2 = teclado.nextLine();

        if (blackjack.resultado(carta1, carta2) == 1)
            System.out.printf("\nO jogador %s ganhou! \n\nCarta jogador 1: %s \nCarta jogador 2: %s", nomeJogador1, carta1.name(), carta2.name());

        else if (blackjack.resultado(carta1, carta2) == 2)
            System.out.printf("\nO jogador %s ganhou! \n\nCarta jogador 1: %s \nCarta jogador 2: %s", nomeJogador2, carta1.name(), carta2.name());

        else if (blackjack.resultado(carta1, carta2) == 0)
            System.out.printf("\nEmpate! \nCarta jogador 1: %s \n\nCarta jogador 2: %s", carta1.name(), carta2.name());


    }
}