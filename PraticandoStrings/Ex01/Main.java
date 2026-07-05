package Ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nomeSemformato = sc.nextLine();
         String nomeFormatado = nomeSemformato.trim();
        System.out.println(nomeFormatado);
    }
}
