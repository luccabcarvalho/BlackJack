import java.lang.Math;
public enum blackjack {

    //define um objeto para cada valor de carta possível
    AS,
    DOIS,
    TRES,
    QUATRO,
    CINCO,
    SEIS,
    SETE,
    OITO,
    NOVE,
    DEZ,
    VALETE,
    DAMA,
    REI;

    //define atributos para as cartas de cada jogador e para o resultado

    static blackjack cartas() {
        blackjack[] vetorCartas = blackjack.values();
        int max = 13 ;
        int min = 1;
        int range = max - min + 1;
        int pos;

        pos = (int) (Math.random() * range) + min;

        blackjack cartaJogador = vetorCartas[pos];

        return cartaJogador;
    }

    static int resultado(blackjack cartaJogador1, blackjack cartaJogador2) {
        int resultado = 0;

        if (cartaJogador1.ordinal() > cartaJogador2.ordinal())
            resultado = 1;

        else if (cartaJogador2.ordinal() > cartaJogador1.ordinal())
            resultado = 2;

        else if (cartaJogador2.ordinal() == cartaJogador1.ordinal())
            resultado = 0;

        return resultado;
        }
    }

