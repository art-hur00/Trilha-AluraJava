package Ex02;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        String textoMinusculo = texto.toLowerCase();
        String textoMaiusculo = texto.toUpperCase();

        System.out.printf("Texto em minusculo: %s \nTexto em maiusculo: %s", textoMinusculo, textoMaiusculo);
    }
}
