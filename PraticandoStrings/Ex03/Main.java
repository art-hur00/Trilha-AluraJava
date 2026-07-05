package Ex03;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();
        System.out.print("Digite a palavra a ser substituida: ");
        String palavraSubstituir = scanner.nextLine();
        System.out.print("Digite a nova palavra: ");
        String novaPalavra = scanner.nextLine();

        try{
            String novotexto = texto.replace(palavraSubstituir, novaPalavra);
            System.out.printf("Texto modificado: %s", novotexto);
        }catch (Exception e){
            System.out.println("Erro! Palavra nao encontrada");
        }
        scanner.close();
    }
}
