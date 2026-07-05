package Ex04;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeSemFormatacao = scanner.nextLine();
        String nomeFormatado = nomeSemFormatacao.substring(0,15);
        System.out.printf("Nome do arquivo sem extensao: %s", nomeFormatado);
    }
}
