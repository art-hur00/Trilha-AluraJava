package Exemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fruta uva = new Fruta("Uva", "Roxo");

        Fruta maracuja = new Fruta("Maracuja", "Amarelo");

        Fruta cereja = new Fruta("cereja", "Vermelho");

        uva.setCaroco(false);


        uva.exibirFruta();
        maracuja.exibirFruta();

        uva.temCaroco();
        maracuja.temCaroco();
        cereja.temCaroco();


    }
}
